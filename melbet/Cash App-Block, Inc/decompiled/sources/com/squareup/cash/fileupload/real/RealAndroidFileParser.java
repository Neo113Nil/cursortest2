package com.squareup.cash.fileupload.real;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.history.presenters.CheckStatusPresenter;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import kotlin.UnsignedKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.io.FilesKt__UtilsKt;
import kotlin.text.Regex;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okio.BufferedSink;
import okio.InputStreamSource;
import okio.Okio;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class RealAndroidFileParser {
    public final ContentResolver contentResolver;

    /* loaded from: classes9.dex */
    public final class FileUploadRequestBody extends RequestBody {
        public final File file;

        public FileUploadRequestBody(File file) {
            this.file = file;
        }

        @Override // okhttp3.RequestBody
        public final long contentLength() {
            return this.file.length();
        }

        @Override // okhttp3.RequestBody
        public final MediaType contentType() {
            String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(FilesKt__UtilsKt.getExtension(this.file));
            if (mimeTypeFromExtension == null) {
                mimeTypeFromExtension = "application/octet-stream";
            }
            Regex regex = MediaType.TYPE_SUBTYPE;
            return UnsignedKt.get(mimeTypeFromExtension);
        }

        @Override // okhttp3.RequestBody
        public final void writeTo(BufferedSink bufferedSink) {
            FileInputStream fileInputStream = new FileInputStream(this.file);
            try {
                bufferedSink.writeAll(Okio.source(fileInputStream));
                fileInputStream.close();
            } finally {
            }
        }
    }

    /* loaded from: classes9.dex */
    public final class UriUploadRequestBody extends RequestBody {
        public final ContentResolver contentResolver;
        public final Uri uri;

        public UriUploadRequestBody(ContentResolver contentResolver, Uri uri) {
            contentResolver.getClass();
            this.contentResolver = contentResolver;
            this.uri = uri;
        }

        @Override // okhttp3.RequestBody
        public final long contentLength() {
            Long valueOf;
            try {
                Cursor query = this.contentResolver.query(this.uri, null, null, null, null, null);
                if (query != null) {
                    try {
                        if (query.moveToFirst()) {
                            int columnIndex = query.getColumnIndex("_size");
                            valueOf = !query.isNull(columnIndex) ? Long.valueOf(query.getLong(columnIndex)) : null;
                        } else {
                            valueOf = -1L;
                        }
                        query.close();
                        if (valueOf != null) {
                            return valueOf.longValue();
                        }
                    } finally {
                    }
                }
            } catch (IOException | SecurityException unused) {
            }
            return -1L;
        }

        @Override // okhttp3.RequestBody
        public final MediaType contentType() {
            String type2 = this.contentResolver.getType(this.uri);
            if (type2 != null) {
                Regex regex = MediaType.TYPE_SUBTYPE;
                try {
                    return UnsignedKt.get(type2);
                } catch (IllegalArgumentException unused) {
                }
            }
            return null;
        }

        @Override // okhttp3.RequestBody
        public final void writeTo(BufferedSink bufferedSink) {
            try {
                InputStream openInputStream = this.contentResolver.openInputStream(this.uri);
                if (openInputStream == null) {
                    throw new IOException("Failed to open uri.");
                }
                InputStreamSource source = Okio.source(openInputStream);
                try {
                    bufferedSink.writeAll(source);
                    source.close();
                } finally {
                }
            } catch (SecurityException unused) {
                a$$ExternalSyntheticBUOutline0.m$4("Failed to open uri.");
            }
        }
    }

    public RealAndroidFileParser(Context context) {
        this.contentResolver = context.getContentResolver();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Type inference failed for: r8v6, types: [byte[], java.io.Serializable] */
    /* renamed from: getData-8YU3vEA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable m3556getData8YU3vEA(String str, ContinuationImpl continuationImpl) {
        RealAndroidFileParser$getData$1 realAndroidFileParser$getData$1;
        int i;
        try {
            if (continuationImpl instanceof RealAndroidFileParser$getData$1) {
                realAndroidFileParser$getData$1 = (RealAndroidFileParser$getData$1) continuationImpl;
                int i2 = realAndroidFileParser$getData$1.label;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    realAndroidFileParser$getData$1.label = i2 - PKIFailureInfo.systemUnavail;
                    Object obj = realAndroidFileParser$getData$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = realAndroidFileParser$getData$1.label;
                    Continuation continuation = null;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        Uri parse = Uri.parse(str);
                        DefaultScheduler defaultScheduler = Dispatchers.Default;
                        DefaultIoScheduler defaultIoScheduler = DefaultIoScheduler.INSTANCE;
                        CheckStatusPresenter.AnonymousClass1.C00611 c00611 = new CheckStatusPresenter.AnonymousClass1.C00611(this, parse, continuation, 9);
                        realAndroidFileParser$getData$1.label = 1;
                        obj = JobKt.withContext(defaultIoScheduler, c00611, realAndroidFileParser$getData$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return (byte[]) obj;
                }
            }
            if (i != 0) {
            }
            return (byte[]) obj;
        } catch (IOException | SecurityException unused) {
            return null;
        }
        realAndroidFileParser$getData$1 = new RealAndroidFileParser$getData$1(this, continuationImpl);
        Object obj2 = realAndroidFileParser$getData$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realAndroidFileParser$getData$1.label;
        Continuation continuation2 = null;
    }
}

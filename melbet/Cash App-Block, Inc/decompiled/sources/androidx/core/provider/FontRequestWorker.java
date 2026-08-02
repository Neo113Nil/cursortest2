package androidx.core.provider;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Trace;
import androidx.collection.LruCache;
import androidx.collection.SimpleArrayMap;
import androidx.core.graphics.TypefaceCompat;
import androidx.core.provider.FontsContractCompat;
import com.google.android.gms.dynamite.zzg;
import com.google.android.play.core.splitcompat.zzc;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public abstract class FontRequestWorker {
    public static final ThreadPoolExecutor DEFAULT_EXECUTOR_SERVICE;
    public static final Object LOCK;
    public static final SimpleArrayMap PENDING_REPLIES;
    public static final LruCache sTypefaceCache = new LruCache(16);

    /* renamed from: androidx.core.provider.FontRequestWorker$1, reason: invalid class name */
    public final class AnonymousClass1 implements Callable {
        public final /* synthetic */ int $r8$classId;
        public final /* synthetic */ Context val$context;
        public final /* synthetic */ String val$id;
        public final /* synthetic */ Object val$request;
        public final /* synthetic */ int val$style;

        public /* synthetic */ AnonymousClass1(String str, Context context, Object obj, int i, int i2) {
            this.$r8$classId = i2;
            this.val$id = str;
            this.val$context = context;
            this.val$request = obj;
            this.val$style = i;
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            int i = this.$r8$classId;
            int i2 = this.val$style;
            Object obj = this.val$request;
            Context context = this.val$context;
            String str = this.val$id;
            switch (i) {
                case 0:
                    Object[] objArr = {(FontRequest) obj};
                    ArrayList arrayList = new ArrayList(1);
                    Object obj2 = objArr[0];
                    Objects.requireNonNull(obj2);
                    arrayList.add(obj2);
                    return FontRequestWorker.getFontSync(str, context, Collections.unmodifiableList(arrayList), i2);
                default:
                    try {
                        return FontRequestWorker.getFontSync(str, context, (List) obj, i2);
                    } catch (Throwable unused) {
                        return new TypefaceResult(-3);
                    }
            }
        }
    }

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000L, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new zzc(2));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        DEFAULT_EXECUTOR_SERVICE = threadPoolExecutor;
        LOCK = new Object();
        PENDING_REPLIES = new SimpleArrayMap(0);
    }

    public static String createCacheId(int i, List list) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < list.size(); i2++) {
            sb.append(((FontRequest) list.get(i2)).mIdentifier);
            sb.append("-");
            sb.append(i);
            if (i2 < list.size() - 1) {
                sb.append(";");
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0051 A[Catch: all -> 0x00a3, TRY_LEAVE, TryCatch #1 {all -> 0x00a3, NameNotFoundException -> 0x0099, all -> 0x0075, blocks: (B:3:0x000c, B:5:0x0014, B:10:0x001d, B:11:0x0021, B:16:0x0051, B:19:0x005a, B:21:0x0060, B:24:0x0071, B:26:0x0084, B:29:0x0090, B:34:0x0076, B:35:0x0079, B:36:0x007a, B:38:0x002f, B:40:0x0035, B:43:0x0039, B:45:0x003e, B:47:0x0049, B:56:0x0099, B:23:0x006b), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005a A[Catch: all -> 0x00a3, TRY_ENTER, TryCatch #1 {all -> 0x00a3, NameNotFoundException -> 0x0099, all -> 0x0075, blocks: (B:3:0x000c, B:5:0x0014, B:10:0x001d, B:11:0x0021, B:16:0x0051, B:19:0x005a, B:21:0x0060, B:24:0x0071, B:26:0x0084, B:29:0x0090, B:34:0x0076, B:35:0x0079, B:36:0x007a, B:38:0x002f, B:40:0x0035, B:43:0x0039, B:45:0x003e, B:47:0x0049, B:56:0x0099, B:23:0x006b), top: B:2:0x000c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static TypefaceResult getFontSync(String str, Context context, List list, int i) {
        Typeface typeface;
        int i2;
        Typeface createFromFontInfo;
        LruCache lruCache = sTypefaceCache;
        Trace.beginSection(androidx.tracing.Trace.truncatedTraceSectionLabel("getFontSync"));
        try {
            typeface = (Typeface) lruCache.get(str);
        } catch (PackageManager.NameNotFoundException unused) {
            return new TypefaceResult(-1);
        } catch (Throwable th) {
            throw th;
        } finally {
        }
        if (typeface != null) {
            return new TypefaceResult(typeface);
        }
        FontsContractCompat.FontFamilyResult fontFamilyResult = FontProvider.getFontFamilyResult(context, list);
        List list2 = fontFamilyResult.mFonts;
        int i3 = fontFamilyResult.mStatusCode;
        if (i3 != 0) {
            if (i3 == 1) {
                i2 = -2;
                if (i2 == 0) {
                    return new TypefaceResult(i2);
                }
                if (list2.size() > 1) {
                    zzg zzgVar = TypefaceCompat.sTypefaceCompatImpl;
                    Trace.beginSection(androidx.tracing.Trace.truncatedTraceSectionLabel("TypefaceCompat.createFromFontInfoWithFallback"));
                    createFromFontInfo = TypefaceCompat.sTypefaceCompatImpl.createFromFontInfoWithFallback(context, list2, i);
                    Trace.endSection();
                } else {
                    createFromFontInfo = TypefaceCompat.createFromFontInfo(context, fontFamilyResult.getFonts(), i);
                }
                if (createFromFontInfo == null) {
                    return new TypefaceResult(-3);
                }
                lruCache.put(str, createFromFontInfo);
                return new TypefaceResult(createFromFontInfo);
            }
            i2 = -3;
            if (i2 == 0) {
            }
        } else {
            FontsContractCompat.FontInfo[] fonts = fontFamilyResult.getFonts();
            if (fonts != null && fonts.length != 0) {
                int length = fonts.length;
                int i4 = 0;
                while (true) {
                    if (i4 >= length) {
                        i2 = 0;
                        break;
                    }
                    int i5 = fonts[i4].mResultCode;
                    if (i5 == 0) {
                        i4++;
                    } else if (i5 >= 0) {
                        i2 = i5;
                    }
                }
                if (i2 == 0) {
                }
            }
            i2 = 1;
            if (i2 == 0) {
            }
        }
        Trace.endSection();
    }

    public final class TypefaceResult {
        public final int mResult;
        public final Typeface mTypeface;

        public TypefaceResult(int i) {
            this.mTypeface = null;
            this.mResult = i;
        }

        public TypefaceResult(Typeface typeface) {
            this.mTypeface = typeface;
            this.mResult = 0;
        }
    }
}

package io.appmetrica.analytics.impl;

import a.AbstractC0083a;
import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.charset.Charset;
import r1.AbstractC1043b;

/* renamed from: io.appmetrica.analytics.impl.ba, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0300ba implements Bo {

    /* renamed from: a, reason: collision with root package name */
    public final Context f5628a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5629b;

    public C0300ba(Context context, String str) {
        this.f5628a = context;
        this.f5629b = str;
    }

    @Override // io.appmetrica.analytics.impl.Bo
    public final String a() {
        try {
            File fileFromSdkStorage = FileUtils.getFileFromSdkStorage(this.f5628a, this.f5629b);
            if (fileFromSdkStorage != null) {
                fileFromSdkStorage.exists();
                File fileFromAppStorage = FileUtils.getFileFromAppStorage(this.f5628a, this.f5629b);
                if (fileFromAppStorage != null) {
                    FileUtils.copyToNullable(fileFromAppStorage, fileFromSdkStorage);
                }
                return AbstractC1043b.H(fileFromSdkStorage);
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    @Override // io.appmetrica.analytics.impl.Bo
    public final void a(String text) {
        try {
            File fileFromSdkStorage = FileUtils.getFileFromSdkStorage(this.f5628a, this.f5629b);
            if (fileFromSdkStorage == null) {
                return;
            }
            Charset charset = z1.a.f8620a;
            kotlin.jvm.internal.i.e(text, "text");
            kotlin.jvm.internal.i.e(charset, "charset");
            FileOutputStream fileOutputStream = new FileOutputStream(fileFromSdkStorage);
            try {
                AbstractC1043b.I(fileOutputStream, text, charset);
                AbstractC0083a.e(fileOutputStream, null);
            } finally {
            }
        } catch (Throwable unused) {
        }
    }
}

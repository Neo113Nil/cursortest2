package ru.yandex.taxi.perf.analytics.storage;

import defpackage.tls;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
final /* synthetic */ class AppStorageAnalytics$scanDirectory$dirs$1$size$1 extends FunctionReferenceImpl implements tls {
    public static final AppStorageAnalytics$scanDirectory$dirs$1$size$1 b = new AppStorageAnalytics$scanDirectory$dirs$1$size$1(1, 0, File.class, "isFile", "isFile()Z");

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return Boolean.valueOf(((File) obj).isFile());
    }
}

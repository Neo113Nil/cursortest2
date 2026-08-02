package com.datadog.android.core.internal.persistence.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import kotlin.io.FilesKt__FileReadWriteKt;
import kotlin.io.TextStreamsKt$$ExternalSyntheticLambda0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import papa.AppUpdateData;

/* loaded from: classes9.dex */
public final class FileExtKt$readTextSafe$1 extends Lambda implements Function1 {
    public final /* synthetic */ Charset $charset;
    public final /* synthetic */ int $r8$classId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FileExtKt$readTextSafe$1(int i, Charset charset) {
        super(1);
        this.$r8$classId = i;
        this.$charset = charset;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        Charset charset = this.$charset;
        switch (i) {
            case 0:
                File file = (File) obj;
                file.getClass();
                return FilesKt__FileReadWriteKt.readText(file, charset);
            default:
                File file2 = (File) obj;
                file2.getClass();
                ArrayList arrayList = new ArrayList();
                AppUpdateData.forEachLine(new BufferedReader(new InputStreamReader(new FileInputStream(file2), charset)), new TextStreamsKt$$ExternalSyntheticLambda0(14, arrayList));
                return arrayList;
        }
    }
}

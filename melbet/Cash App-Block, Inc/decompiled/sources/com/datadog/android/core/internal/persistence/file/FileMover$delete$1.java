package com.datadog.android.core.internal.persistence.file;

import java.io.File;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes4.dex */
public final class FileMover$delete$1 extends Lambda implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ File $target;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FileMover$delete$1(File file, int i) {
        super(0);
        this.$r8$classId = i;
        this.$target = file;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        File file = this.$target;
        switch (i) {
        }
        return String.format(Locale.US, "Unable to write data to file: %s", Arrays.copyOf(new Object[]{file.getPath()}, 1));
    }
}

package com.bugsnag.android;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsJVMKt;

/* loaded from: classes4.dex */
public final class RootDetector$checkBuildProps$1$1$1 extends Lambda implements Function1 {
    public static final RootDetector$checkBuildProps$1$1$1 INSTANCE;
    public static final RootDetector$checkBuildProps$1$1$1 INSTANCE$1;
    public final /* synthetic */ int $r8$classId;

    static {
        int i = 1;
        INSTANCE = new RootDetector$checkBuildProps$1$1$1(i, 0);
        INSTANCE$1 = new RootDetector$checkBuildProps$1$1$1(i, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RootDetector$checkBuildProps$1$1$1(int i, int i2) {
        super(i);
        this.$r8$classId = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String replace;
        switch (this.$r8$classId) {
            case 0:
                replace = new Regex("\\s").replace((String) obj, "");
                return replace;
            default:
                String str = (String) obj;
                return Boolean.valueOf(StringsKt__StringsJVMKt.startsWith(str, "ro.debuggable=[1]", false) || StringsKt__StringsJVMKt.startsWith(str, "ro.secure=[0]", false));
        }
    }
}

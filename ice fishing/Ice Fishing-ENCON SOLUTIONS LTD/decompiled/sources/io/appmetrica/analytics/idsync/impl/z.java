package io.appmetrica.analytics.idsync.impl;

/* loaded from: classes.dex */
public abstract /* synthetic */ class z {
    public static /* synthetic */ String a(int i2) {
        if (i2 == 1) {
            return "none";
        }
        if (i2 == 2) {
            return "success";
        }
        if (i2 == 3) {
            return "incompatible_precondition";
        }
        if (i2 == 4) {
            return "failure";
        }
        throw null;
    }

    public static /* synthetic */ String b(int i2) {
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? "null" : "FAILURE" : "INCOMPATIBLE_PRECONDITION" : "SUCCESS" : "NONE";
    }
}

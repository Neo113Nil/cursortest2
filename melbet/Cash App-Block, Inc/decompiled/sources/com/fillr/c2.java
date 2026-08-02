package com.fillr;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes4.dex */
public final class c2 {
    public static final String[] c = {"none", "optional", "prohibited", "required"};
    public static final String[] c$1 = {"lax", "none", "skip", "strict"};
    public static final String[] c$2 = {"all", "empty", "extension", "list", "none", "restriction", "substitution", "union"};
    public static final String[] c$3 = {"none", "qualified", "unqualified"};
    public final /* synthetic */ int $r8$classId;
    public final String a;

    public c2(String str, int i) {
        String[] strArr;
        this.$r8$classId = i;
        this.a = "NULL";
        if (str.equals("NULL")) {
            this.a = "NULL";
            return;
        }
        switch (this.$r8$classId) {
            case 0:
                strArr = c;
                break;
            case 1:
                strArr = c$1;
                break;
            case 2:
                strArr = c$2;
                break;
            default:
                strArr = c$3;
                break;
        }
        String[] split = str.split("\\s");
        for (int i2 = 0; i2 < split.length; i2++) {
            for (int i3 = 0; i3 < strArr.length && !strArr[i3].equals(split[i2]); i3++) {
                if (i2 == strArr.length - 1) {
                    throw new g$a(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Bad Enumeration value '", str, "'"));
                }
            }
        }
        this.a = str;
    }

    public final boolean equals(Object obj) {
        return obj.getClass().equals(getClass()) && ((c2) obj).a.equals(this.a);
    }

    public final String toString() {
        return this.a;
    }
}

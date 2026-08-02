package com.fillr;

import java.util.Map;

/* loaded from: classes4.dex */
public abstract class l1 {
    public String c;
    public Map d = null;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l1)) {
            return false;
        }
        String str = this.c;
        String str2 = ((l1) obj).c;
        if (str != null) {
            if (!str.equals(str2)) {
                return false;
            }
        } else if (str2 != null) {
            return false;
        }
        return true;
    }
}

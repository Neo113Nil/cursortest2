package com.yandex.passport.internal.ui.sloth.ebs;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class m1 implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<m1> CREATOR;
    public static final m1 a;
    public static final m1 b;
    public static final m1 c;
    public static final m1 d;
    public static final m1 e;
    public static final m1 f;
    public static final m1 g;
    public static final m1 h;
    public static final m1 i;
    public static final m1 j;
    public static final m1 k;
    public static final m1 l;
    public static final m1 m;
    public static final m1 n;
    public static final m1 o;
    public static final m1 p;
    public static final m1 q;
    public static final m1 r;
    public static final m1 s;
    public static final m1 t;
    public static final /* synthetic */ m1[] u;

    static {
        m1 m1Var = new m1("SESSION_INIT", 0);
        a = m1Var;
        m1 m1Var2 = new m1("RETRYING_SESSION", 1);
        m1 m1Var3 = new m1("EBS_SDK_BIO_PHOTO_CHECK_PENDING", 2);
        b = m1Var3;
        m1 m1Var4 = new m1("ESIA_CONSENT_PENDING", 3);
        c = m1Var4;
        m1 m1Var5 = new m1("EBS_SDK_INIT_PENDING", 4);
        m1 m1Var6 = new m1("LOW_AGE_ALERT", 5);
        d = m1Var6;
        m1 m1Var7 = new m1("ESIA_BIO_MISSING_ALERT", 6);
        e = m1Var7;
        m1 m1Var8 = new m1("ESIA_CONSENT_NEEDED", 7);
        f = m1Var8;
        m1 m1Var9 = new m1("EBS_REGISTRATION_PENDING", 8);
        g = m1Var9;
        m1 m1Var10 = new m1("EBS_REGISTRATION_TIMEOUT_V2", 9);
        h = m1Var10;
        m1 m1Var11 = new m1("EBS_SDK_CHECK_NEEDED_ALERT", 10);
        i = m1Var11;
        m1 m1Var12 = new m1("EBS_SDK_INSTALLING_ERROR_ALERT", 11);
        j = m1Var12;
        m1 m1Var13 = new m1("EBS_SDK_BIO_PHOTO_CHECK_ALERT", 12);
        k = m1Var13;
        m1 m1Var14 = new m1("EBS_SDK_BIO_PHOTO_CHECK_CONSENT_NEEDED", 13);
        l = m1Var14;
        m1 m1Var15 = new m1("EBS_SDK_BIO_PHOTO_CHECK_OPEN_SETTINGS", 14);
        m = m1Var15;
        m1 m1Var16 = new m1("EBS_SDK_BIO_PHOTO_CHECK_FAILED_ALERT", 15);
        n = m1Var16;
        m1 m1Var17 = new m1("CREATE_TRACK_ID_REQUEST_FAILED", 16);
        o = m1Var17;
        m1 m1Var18 = new m1("CREATE_JWT_REQUEST_FAILED", 17);
        p = m1Var18;
        m1 m1Var19 = new m1("START_SESSION_REQUEST_FAILED_V2", 18);
        q = m1Var19;
        m1 m1Var20 = new m1("CHECK_TRACK_ID_REQUEST_FAILED", 19);
        r = m1Var20;
        m1 m1Var21 = new m1("UNKNOWN_STATE_FOR_AM", 20);
        s = m1Var21;
        m1 m1Var22 = new m1("UNEXPECTED_AM_ERROR", 21);
        t = m1Var22;
        u = new m1[]{m1Var, m1Var2, m1Var3, m1Var4, m1Var5, m1Var6, m1Var7, m1Var8, m1Var9, m1Var10, m1Var11, m1Var12, m1Var13, m1Var14, m1Var15, m1Var16, m1Var17, m1Var18, m1Var19, m1Var20, m1Var21, m1Var22, new m1("UNEXPECTED_LK_ERROR", 22)};
        CREATOR = new e(5);
    }

    public static m1 valueOf(String str) {
        return (m1) Enum.valueOf(m1.class, str);
    }

    public static m1[] values() {
        return (m1[]) u.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.getClass();
        parcel.writeString(name());
    }
}

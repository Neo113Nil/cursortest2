package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.io.File;
import java.util.HashSet;

/* loaded from: classes2.dex */
public final class Hz {

    /* renamed from: a, reason: collision with root package name */
    public final File f25416a;

    /* renamed from: b, reason: collision with root package name */
    public final File f25417b;

    /* renamed from: c, reason: collision with root package name */
    public final SharedPreferences f25418c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC3135eN f25419d;

    /* renamed from: e, reason: collision with root package name */
    public final C3983uA f25420e;

    public Hz(Context context, SharedPreferences sharedPreferences, InterfaceC3135eN interfaceC3135eN, C3983uA c3983uA) {
        this.f25418c = sharedPreferences;
        File dir = context.getDir("pccache2", 0);
        MA.G(dir, false);
        this.f25416a = dir;
        File dir2 = context.getDir("tmppccache2", 0);
        MA.G(dir2, true);
        this.f25417b = dir2;
        this.f25419d = interfaceC3135eN;
        this.f25420e = c3983uA;
    }

    public final void a(Ky ky, byte[] bArr, byte[] bArr2) {
        String A9 = ky.A().A();
        boolean isEmpty = TextUtils.isEmpty(A9);
        C3983uA c3983uA = this.f25420e;
        if (!isEmpty && bArr2.length != 0) {
            File file = this.f25417b;
            MA.N(file);
            file.mkdirs();
            File y7 = MA.y(A9, file);
            y7.getClass();
            y7.mkdirs();
            File c9 = MA.c(A9, "pcam.jar", file);
            c9.getClass();
            if (bArr == null || bArr.length <= 0 || MA.u(c9, bArr)) {
                File c10 = MA.c(A9, "pcbc", file);
                c10.getClass();
                if (MA.u(c10, bArr2)) {
                    String A10 = ky.A().A();
                    if (!TextUtils.isEmpty(A10)) {
                        File c11 = MA.c(A10, "pcam.jar", file);
                        c11.getClass();
                        File c12 = MA.c(A10, "pcbc", file);
                        c12.getClass();
                        File c13 = MA.c(A10, "pcam.jar", c());
                        c13.getClass();
                        File c14 = MA.c(A10, "pcbc", c());
                        c14.getClass();
                        if (c11.exists() && !c11.renameTo(c13)) {
                            c3983uA.b(15318);
                        } else if (c12.exists() && c12.renameTo(c14)) {
                            Ky b9 = b(1);
                            SharedPreferences.Editor edit = this.f25418c.edit();
                            if (b9 != null && !ky.A().A().equals(b9.A().A())) {
                                edit.putString(d(), T2.b.b(b9.b()));
                            }
                            edit.putString(e(), T2.b.b(ky.b()));
                            if (!edit.commit()) {
                                c3983uA.b(15320);
                            }
                        } else {
                            c3983uA.b(15319);
                        }
                    }
                    HashSet hashSet = new HashSet();
                    Ky b10 = b(1);
                    if (b10 != null) {
                        hashSet.add(b10.A().A());
                    }
                    Ky b11 = b(2);
                    if (b11 != null) {
                        hashSet.add(b11.A().A());
                    }
                    File[] listFiles = c().listFiles();
                    if (listFiles != null) {
                        for (File file2 : listFiles) {
                            String name = file2.getName();
                            if (!hashSet.contains(name)) {
                                File y9 = MA.y(name, c());
                                y9.getClass();
                                MA.N(y9);
                            }
                        }
                        return;
                    }
                    return;
                }
            }
        }
        c3983uA.b(15316);
    }

    public final Ky b(int i) {
        SharedPreferences sharedPreferences = this.f25418c;
        String string = i == 1 ? sharedPreferences.getString(e(), null) : sharedPreferences.getString(d(), null);
        if (!TextUtils.isEmpty(string)) {
            try {
                byte[] j6 = T2.b.j(string);
                Ky E8 = Ky.E(JK.s(j6, 0, j6.length));
                String A9 = E8.A().A();
                File c9 = MA.c(A9, "pcam.jar", c());
                if (c9 == null) {
                    throw null;
                }
                if (!c9.exists() && (c9 = MA.c(A9, "pcam", c())) == null) {
                    throw null;
                }
                File c10 = MA.c(A9, "pcbc", c());
                if (c10 == null) {
                    throw null;
                }
                if (c9.exists() && c10.exists()) {
                    return E8;
                }
            } catch (C3295hL unused) {
                this.f25420e.b(15317);
            }
        }
        return null;
    }

    public final File c() {
        File file = new File(this.f25416a, Integer.toString(((EnumC2960b8) this.f25419d.f()).f29227n));
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    public final String d() {
        int i = ((EnumC2960b8) this.f25419d.f()).f29227n;
        return D.y.m(i, "FBAMTD", new StringBuilder(String.valueOf(i).length() + 6));
    }

    public final String e() {
        int i = ((EnumC2960b8) this.f25419d.f()).f29227n;
        return D.y.m(i, "LATMTD", new StringBuilder(String.valueOf(i).length() + 6));
    }
}

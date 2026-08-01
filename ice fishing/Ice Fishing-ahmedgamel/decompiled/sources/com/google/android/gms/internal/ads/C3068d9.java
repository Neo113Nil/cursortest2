package com.google.android.gms.internal.ads;

import android.os.Environment;
import android.os.SystemClock;
import android.util.Base64;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import p2.C4835j;

/* renamed from: com.google.android.gms.internal.ads.d9, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3068d9 {

    /* renamed from: a, reason: collision with root package name */
    public final com.bumptech.glide.manager.p f29714a;

    /* renamed from: b, reason: collision with root package name */
    public final Z9 f29715b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f29716c;

    public C3068d9() {
        this.f29715b = C2925aa.L();
        this.f29716c = false;
        this.f29714a = new com.bumptech.glide.manager.p(6);
    }

    public final synchronized void a(InterfaceC3014c9 interfaceC3014c9) {
        if (this.f29716c) {
            try {
                interfaceC3014c9.b(this.f29715b);
            } catch (NullPointerException e9) {
                C4835j.f39733C.f39743h.d("AdMobClearcutLogger.modify", e9);
            }
        }
    }

    public final synchronized void b(int i) {
        if (this.f29716c) {
            if (((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32219c6)).booleanValue()) {
                d(i);
            } else {
                c(i);
            }
        }
    }

    public final synchronized void c(int i) {
        Z9 z9 = this.f29715b;
        z9.h();
        ((C2925aa) z9.f27721u).F();
        ArrayList H8 = u2.D.H();
        z9.h();
        ((C2925aa) z9.f27721u).E(H8);
        byte[] b9 = ((C2925aa) z9.j()).b();
        com.bumptech.glide.manager.p pVar = this.f29714a;
        C3493l5 c3493l5 = new C3493l5();
        Objects.requireNonNull(pVar);
        c3493l5.f31709v = pVar;
        c3493l5.f31708u = b9;
        int i6 = i - 1;
        c3493l5.f31707n = i6;
        synchronized (c3493l5) {
            ((ExecutorService) ((com.bumptech.glide.manager.p) c3493l5.f31709v).f23471w).execute(new RunnableC3111e(11, c3493l5));
        }
        u2.z.k("Logging Event with event code : ".concat(String.valueOf(Integer.toString(i6, 10))));
    }

    public final synchronized void d(int i) {
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (externalStorageDirectory == null) {
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(new File(externalStorageDirectory, "clearcut_events.txt").getPath()), true);
            try {
                try {
                    fileOutputStream.write(e(i).getBytes());
                } catch (IOException unused) {
                    u2.z.k("Could not write Clearcut to file.");
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused2) {
                        u2.z.k("Could not close Clearcut output stream.");
                    }
                }
            } finally {
                try {
                    fileOutputStream.close();
                } catch (IOException unused3) {
                    u2.z.k("Could not close Clearcut output stream.");
                }
            }
        } catch (FileNotFoundException unused4) {
            u2.z.k("Could not find file for Clearcut");
        }
    }

    public final synchronized String e(int i) {
        StringBuilder sb;
        Z9 z9 = this.f29715b;
        String K7 = ((C2925aa) z9.f27721u).K();
        C4835j.f39733C.f39745k.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        String encodeToString = Base64.encodeToString(((C2925aa) z9.j()).b(), 3);
        sb = new StringBuilder("id=");
        sb.append(K7);
        sb.append(",timestamp=");
        sb.append(elapsedRealtime);
        sb.append(",event=");
        sb.append(i - 1);
        sb.append(",data=");
        sb.append(encodeToString);
        sb.append("\n");
        return sb.toString();
    }

    public C3068d9(com.bumptech.glide.manager.p pVar) {
        this.f29715b = C2925aa.L();
        this.f29714a = pVar;
        this.f29716c = ((Boolean) q2.r.f40207e.f40210c.a(AbstractC3569ma.f32209b6)).booleanValue();
    }
}

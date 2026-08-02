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
import r2.C4906k;

/* renamed from: com.google.android.gms.internal.ads.d9, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3091d9 {

    /* renamed from: a, reason: collision with root package name */
    public final com.bumptech.glide.manager.o f30486a;

    /* renamed from: b, reason: collision with root package name */
    public final Z9 f30487b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f30488c;

    public C3091d9() {
        this.f30487b = C2948aa.L();
        this.f30488c = false;
        this.f30486a = new com.bumptech.glide.manager.o(6);
    }

    public final synchronized void a(InterfaceC3037c9 interfaceC3037c9) {
        if (this.f30488c) {
            try {
                interfaceC3037c9.b(this.f30487b);
            } catch (NullPointerException e9) {
                C4906k.f40186C.f40196h.d("AdMobClearcutLogger.modify", e9);
            }
        }
    }

    public final synchronized void b(int i) {
        if (this.f30488c) {
            if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f32998c6)).booleanValue()) {
                d(i);
            } else {
                c(i);
            }
        }
    }

    public final synchronized void c(int i) {
        Z9 z9 = this.f30487b;
        z9.h();
        ((C2948aa) z9.f28504u).F();
        ArrayList H8 = w2.D.H();
        z9.h();
        ((C2948aa) z9.f28504u).E(H8);
        byte[] b9 = ((C2948aa) z9.j()).b();
        com.bumptech.glide.manager.o oVar = this.f30486a;
        C3516l5 c3516l5 = new C3516l5();
        Objects.requireNonNull(oVar);
        c3516l5.f32489v = oVar;
        c3516l5.f32488u = b9;
        int i4 = i - 1;
        c3516l5.f32487n = i4;
        synchronized (c3516l5) {
            ((ExecutorService) ((com.bumptech.glide.manager.o) c3516l5.f32489v).f24256w).execute(new RunnableC3134e(11, c3516l5));
        }
        w2.z.k("Logging Event with event code : ".concat(String.valueOf(Integer.toString(i4, 10))));
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
                    w2.z.k("Could not write Clearcut to file.");
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused2) {
                        w2.z.k("Could not close Clearcut output stream.");
                    }
                }
            } finally {
                try {
                    fileOutputStream.close();
                } catch (IOException unused3) {
                    w2.z.k("Could not close Clearcut output stream.");
                }
            }
        } catch (FileNotFoundException unused4) {
            w2.z.k("Could not find file for Clearcut");
        }
    }

    public final synchronized String e(int i) {
        StringBuilder sb;
        Z9 z9 = this.f30487b;
        String K7 = ((C2948aa) z9.f28504u).K();
        C4906k.f40186C.f40198k.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        String encodeToString = Base64.encodeToString(((C2948aa) z9.j()).b(), 3);
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

    public C3091d9(com.bumptech.glide.manager.o oVar) {
        this.f30487b = C2948aa.L();
        this.f30486a = oVar;
        this.f30488c = ((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.f32988b6)).booleanValue();
    }
}

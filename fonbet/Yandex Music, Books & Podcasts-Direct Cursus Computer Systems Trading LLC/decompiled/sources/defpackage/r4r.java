package defpackage;

import android.util.SparseIntArray;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.text.Charsets;

/* loaded from: classes5.dex */
public final class r4r extends lyd {
    public final Object b;
    public final wno c;
    public final wno d;

    public r4r() {
        super("UMA.LogUpload.ResponseOrErrorCode");
        this.b = new Object();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            byte[] bytes = "UMA.LogUpload.ResponseOrErrorCode".getBytes(Charsets.UTF_8);
            bytes.getClass();
            wno wnoVar = new wno(ByteBuffer.wrap(messageDigest.digest(bytes)).order(ByteOrder.BIG_ENDIAN).getLong());
            this.c = wnoVar;
            this.d = new wno(wnoVar.a.a);
        } catch (NoSuchAlgorithmException e) {
            wvs.m(e);
            throw null;
        }
    }

    @Override // defpackage.lyd
    public final void a(int i, int i2) {
        if (i2 <= 0) {
            return;
        }
        synchronized (this.b) {
            wno wnoVar = this.c;
            SparseIntArray sparseIntArray = wnoVar.b;
            sparseIntArray.put(i, sparseIntArray.get(i) + i2);
            long j = i2 * i;
            wnoVar.d(i2, j, j);
        }
    }

    @Override // defpackage.lyd
    public final void b(int i) {
        a(i, 1);
    }

    @Override // defpackage.lyd
    public final boolean e(int i, int i2, int i3) {
        return false;
    }

    @Override // defpackage.lyd
    public final long f() {
        return this.c.a.a;
    }

    @Override // defpackage.lyd
    public final wyd g() {
        wno wnoVar = new wno(f());
        synchronized (this.b) {
            wnoVar.a(this.c);
            wno wnoVar2 = this.c;
            wnoVar2.getClass();
            m78 m78Var = wnoVar.a;
            wnoVar2.d(-((AtomicInteger) m78Var.d).get(), -((AtomicLong) m78Var.b).get(), -((AtomicLong) m78Var.c).get());
            wnoVar2.b(wnoVar.e(), 1);
            this.d.a(wnoVar);
        }
        return wnoVar;
    }
}

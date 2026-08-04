package com.gamericefishpro.space.i2;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.i9.d4;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class l2 extends ContentObserver {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(com.gamericefishpro.space.b8.k kVar) {
        super(null);
        Objects.requireNonNull(kVar);
        this.b = kVar;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z) {
        switch (this.a) {
            case 1:
                ((AtomicBoolean) ((com.gamericefishpro.space.b8.k) this.b).d).set(true);
                return;
            case 2:
                d4 d4Var = (d4) this.b;
                synchronized (d4Var.f) {
                    d4Var.g = null;
                    d4Var.c.run();
                    break;
                }
                synchronized (d4Var) {
                    try {
                        Iterator it = d4Var.h.iterator();
                        if (it.hasNext()) {
                            if (it.next() != null) {
                                throw new ClassCastException();
                            }
                            throw null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            default:
                super.onChange(z);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(d4 d4Var) {
        super(null);
        this.b = d4Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(com.gamericefishpro.space.ri.e eVar, Handler handler) {
        super(handler);
        this.b = eVar;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z, Uri uri) {
        switch (this.a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((com.gamericefishpro.space.ri.e) this.b).k(Unit.a);
                break;
            default:
                super.onChange(z, uri);
                break;
        }
    }
}

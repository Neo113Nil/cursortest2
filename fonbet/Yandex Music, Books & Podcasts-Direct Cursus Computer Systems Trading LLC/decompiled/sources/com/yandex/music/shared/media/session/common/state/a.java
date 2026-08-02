package com.yandex.music.shared.media.session.common.state;

import android.net.Uri;
import android.os.Bundle;
import defpackage.anh;
import defpackage.bnh;
import defpackage.cnh;
import defpackage.d51;
import defpackage.dnh;
import defpackage.fnh;
import defpackage.gnh;
import defpackage.hoh;
import defpackage.jnh;
import defpackage.ois;
import defpackage.onh;
import defpackage.qsn;
import defpackage.ris;
import defpackage.sis;
import defpackage.vq1;
import defpackage.xmh;
import defpackage.xnh;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* loaded from: classes3.dex */
public final class a extends sis {
    public static final a f = new a(d51.h);
    public static final Object g = new Object();
    public static final onh h;
    public final xnh e;

    static {
        gnh gnhVar;
        xmh xmhVar = new xmh();
        bnh bnhVar = new bnh();
        List list = Collections.EMPTY_LIST;
        qsn qsnVar = qsn.e;
        dnh dnhVar = new dnh();
        jnh jnhVar = jnh.d;
        Uri uri = Uri.EMPTY;
        vq1.A(((Uri) bnhVar.e) == null || ((UUID) bnhVar.d) != null);
        cnh cnhVar = null;
        if (uri != null) {
            if (((UUID) bnhVar.d) != null) {
                cnhVar = new cnh(bnhVar);
            }
            gnhVar = new gnh(uri, null, cnhVar, null, list, null, qsnVar, -9223372036854775807L);
        } else {
            gnhVar = null;
        }
        h = new onh("com.yandex.music.shared.media.session.common.state.MediaItemsTimeline", new anh(xmhVar), gnhVar, new fnh(dnhVar), hoh.K, jnhVar);
    }

    public a(xnh xnhVar) {
        this.e = xnhVar;
    }

    public static long q(onh onhVar) {
        Bundle bundle = onhVar.d.I;
        if (bundle == null) {
            return -9223372036854775807L;
        }
        long j = bundle.getLong("com.yandex.music.media.metadata.duration", -9223372036854775807L);
        Long valueOf = Long.valueOf(j);
        if (j < 0) {
            valueOf = null;
        }
        if (valueOf != null) {
            return valueOf.longValue();
        }
        return -9223372036854775807L;
    }

    @Override // defpackage.sis
    public final int b(Object obj) {
        obj.getClass();
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.sis
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        return this.e.equals(((a) obj).e);
    }

    @Override // defpackage.sis
    public final ois f(int i, ois oisVar, boolean z) {
        oisVar.getClass();
        onh l = this.e.l(i);
        if (l == null) {
            l = h;
        }
        oisVar.i(i, q(l), 0L, null, null);
        return oisVar;
    }

    @Override // defpackage.sis
    public final int h() {
        return this.e.a();
    }

    @Override // defpackage.sis
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.e});
    }

    @Override // defpackage.sis
    public final Object l(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.sis
    public final ris m(int i, ris risVar, long j) {
        risVar.getClass();
        onh l = this.e.l(i);
        if (l == null) {
            l = h;
        }
        onh onhVar = l;
        hoh hohVar = onhVar.d;
        Bundle bundle = hohVar.I;
        boolean z = bundle != null ? bundle.getBoolean("com.yandex.music.media.metadata.seekable", true) : true;
        Bundle bundle2 = hohVar.I;
        boolean z2 = bundle2 != null ? bundle2.getBoolean("com.yandex.music.media.metadata.dynamic", false) : false;
        Bundle bundle3 = hohVar.I;
        risVar.b(g, onhVar, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, z, z2, bundle3 != null ? bundle3.getBoolean("com.yandex.music.media.metadata.live", false) : false ? onhVar.c : null, 0L, q(onhVar), i, i, 0L);
        return risVar;
    }

    @Override // defpackage.sis
    public final int o() {
        return this.e.a();
    }
}

package com.kolosta.rejin.jilosa.data.local;

import com.kolosta.rejin.jilosa.data.local.BoardDatabase_Impl;
import defpackage.cb0;
import defpackage.hn;
import defpackage.m2;
import defpackage.m20;
import defpackage.ny;
import defpackage.o6;
import defpackage.ok;
import defpackage.p5;
import defpackage.we;
import defpackage.wf;
import defpackage.ws;
import defpackage.y80;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class BoardDatabase_Impl extends BoardDatabase {
    public final cb0 OnDfzHZD;
    public final cb0 k3x7lurq;
    public final cb0 ow5vqvCr;
    public final cb0 ygLcUYwZ;

    public BoardDatabase_Impl() {
        final int i = 0;
        this.k3x7lurq = new cb0(new ok(this) { // from class: l2
            public final /* synthetic */ BoardDatabase_Impl MdtA4re8;

            {
                this.MdtA4re8 = this;
            }

            @Override // defpackage.ok
            public final Object qoPGr6Ce() {
                int i2 = i;
                BoardDatabase_Impl boardDatabase_Impl = this.MdtA4re8;
                switch (i2) {
                    case 0:
                        return new ny(boardDatabase_Impl);
                    case 1:
                        return new y80(boardDatabase_Impl);
                    case 2:
                        return new o6(boardDatabase_Impl);
                    default:
                        return new ws(boardDatabase_Impl);
                }
            }
        });
        final int i2 = 1;
        this.ow5vqvCr = new cb0(new ok(this) { // from class: l2
            public final /* synthetic */ BoardDatabase_Impl MdtA4re8;

            {
                this.MdtA4re8 = this;
            }

            @Override // defpackage.ok
            public final Object qoPGr6Ce() {
                int i22 = i2;
                BoardDatabase_Impl boardDatabase_Impl = this.MdtA4re8;
                switch (i22) {
                    case 0:
                        return new ny(boardDatabase_Impl);
                    case 1:
                        return new y80(boardDatabase_Impl);
                    case 2:
                        return new o6(boardDatabase_Impl);
                    default:
                        return new ws(boardDatabase_Impl);
                }
            }
        });
        final int i3 = 2;
        this.OnDfzHZD = new cb0(new ok(this) { // from class: l2
            public final /* synthetic */ BoardDatabase_Impl MdtA4re8;

            {
                this.MdtA4re8 = this;
            }

            @Override // defpackage.ok
            public final Object qoPGr6Ce() {
                int i22 = i3;
                BoardDatabase_Impl boardDatabase_Impl = this.MdtA4re8;
                switch (i22) {
                    case 0:
                        return new ny(boardDatabase_Impl);
                    case 1:
                        return new y80(boardDatabase_Impl);
                    case 2:
                        return new o6(boardDatabase_Impl);
                    default:
                        return new ws(boardDatabase_Impl);
                }
            }
        });
        final int i4 = 3;
        this.ygLcUYwZ = new cb0(new ok(this) { // from class: l2
            public final /* synthetic */ BoardDatabase_Impl MdtA4re8;

            {
                this.MdtA4re8 = this;
            }

            @Override // defpackage.ok
            public final Object qoPGr6Ce() {
                int i22 = i4;
                BoardDatabase_Impl boardDatabase_Impl = this.MdtA4re8;
                switch (i22) {
                    case 0:
                        return new ny(boardDatabase_Impl);
                    case 1:
                        return new y80(boardDatabase_Impl);
                    case 2:
                        return new o6(boardDatabase_Impl);
                    default:
                        return new ws(boardDatabase_Impl);
                }
            }
        });
    }

    @Override // defpackage.v30
    public final we MdtA4re8() {
        return new m2(this);
    }

    @Override // defpackage.v30
    public final hn NCTxEWno() {
        return new hn(this, new LinkedHashMap(), new LinkedHashMap(), "pairings", "sprint_rounds", "compares", "mood_state");
    }

    @Override // com.kolosta.rejin.jilosa.data.local.BoardDatabase
    public final ny OnDfzHZD() {
        return (ny) this.k3x7lurq.getValue();
    }

    @Override // defpackage.v30
    public final LinkedHashMap P7K7Inc8() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        p5 qoPGr6Ce = m20.qoPGr6Ce(ny.class);
        wf wfVar = wf.NCTxEWno;
        linkedHashMap.put(qoPGr6Ce, wfVar);
        linkedHashMap.put(m20.qoPGr6Ce(y80.class), wfVar);
        linkedHashMap.put(m20.qoPGr6Ce(o6.class), wfVar);
        linkedHashMap.put(m20.qoPGr6Ce(ws.class), wfVar);
        return linkedHashMap;
    }

    @Override // defpackage.v30
    public final Set VgvYg0wo() {
        return new LinkedHashSet();
    }

    @Override // com.kolosta.rejin.jilosa.data.local.BoardDatabase
    public final o6 k3x7lurq() {
        return (o6) this.OnDfzHZD.getValue();
    }

    @Override // com.kolosta.rejin.jilosa.data.local.BoardDatabase
    public final ws ow5vqvCr() {
        return (ws) this.ygLcUYwZ.getValue();
    }

    @Override // defpackage.v30
    public final List qoPGr6Ce(LinkedHashMap linkedHashMap) {
        return new ArrayList();
    }

    @Override // com.kolosta.rejin.jilosa.data.local.BoardDatabase
    public final y80 ygLcUYwZ() {
        return (y80) this.ow5vqvCr.getValue();
    }
}

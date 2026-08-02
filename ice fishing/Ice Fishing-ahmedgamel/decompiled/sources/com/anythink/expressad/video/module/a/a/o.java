package com.anythink.expressad.video.module.a.a;

import com.anythink.core.common.d.t;
import com.anythink.expressad.video.module.AnythinkVideoView;
import java.util.Map;

/* loaded from: classes.dex */
public class o extends k {
    private boolean ai;
    protected int aj;
    private boolean ak;
    private boolean al;
    private boolean am;
    private boolean an;
    private Map<Integer, String> ao;
    private int ap;

    public o(com.anythink.expressad.foundation.d.d dVar, com.anythink.expressad.videocommon.c.c cVar, com.anythink.expressad.videocommon.b.c cVar2, String str, String str2, com.anythink.expressad.video.module.a.a aVar, int i, boolean z6) {
        super(dVar, cVar2, cVar, str, str2, aVar, i, z6);
        this.an = false;
        this.aj = 0;
        this.ap = -1;
        if (this.Y) {
            this.ao = dVar.S();
        }
        this.aj = dVar.i();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x001d, code lost:
    
        if (r8 != 16) goto L67;
     */
    @Override // com.anythink.expressad.video.module.a.a.k, com.anythink.expressad.video.module.a.a.f, com.anythink.expressad.video.module.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(int i, Object obj) {
        int i4;
        com.anythink.expressad.foundation.d.d dVar;
        try {
            if (i != 2) {
                if (i != 130) {
                    if (i != 6) {
                        if (i != 7) {
                            int i6 = 0;
                            if (i == 11) {
                                com.anythink.expressad.videocommon.b.e.a().a(false);
                                b();
                            } else if (i == 12) {
                                b();
                                com.anythink.expressad.videocommon.b.e.a().a(false);
                            } else if (i == 15) {
                                e();
                                d();
                                c();
                                if (obj == null || !(obj instanceof AnythinkVideoView.a)) {
                                    i4 = 0;
                                } else {
                                    int i9 = ((AnythinkVideoView.a) obj).f22482a;
                                    i6 = ((AnythinkVideoView.a) obj).f22483b;
                                    i4 = i9;
                                }
                                if (i6 == 0 && (dVar = this.f22556Z) != null) {
                                    i6 = dVar.bq();
                                }
                                com.anythink.expressad.video.module.b.a.a(t.b().g(), this.f22556Z, i4, i6, this.ah);
                                com.anythink.expressad.video.module.b.a.a(this.f22556Z, this.ao, this.ae, i4);
                                if (!this.am) {
                                    this.am = true;
                                    com.anythink.expressad.video.module.b.a.a(this.f22556Z, this.ae);
                                }
                                if (!this.an) {
                                    int i10 = this.aj;
                                    if (i10 != 0) {
                                        i6 = i10;
                                    }
                                    if (i4 >= i6) {
                                        this.an = true;
                                        i = 17;
                                    }
                                }
                                this.ap = i4;
                            }
                        } else if (this.Y && obj != null && (obj instanceof Integer)) {
                            int intValue = ((Integer) obj).intValue();
                            if (intValue == 2) {
                                if (!this.ak) {
                                    this.ak = true;
                                    com.anythink.expressad.video.module.b.a.b(t.b().g(), this.f22556Z);
                                }
                            } else if (intValue == 1 && !this.ai) {
                                this.ai = true;
                                com.anythink.expressad.video.module.b.a.c(t.b().g(), this.f22556Z);
                            }
                        }
                    }
                } else if (obj instanceof Integer) {
                    this.aj = ((Integer) obj).intValue();
                }
                this.ag.a(i, obj);
            }
            if (this.Y && !this.al) {
                this.al = true;
                b();
                com.anythink.expressad.video.module.b.a.d(t.b().g(), this.f22556Z);
            }
            this.ag.a(i, obj);
        } catch (Throwable th) {
            th.getMessage();
        }
    }
}

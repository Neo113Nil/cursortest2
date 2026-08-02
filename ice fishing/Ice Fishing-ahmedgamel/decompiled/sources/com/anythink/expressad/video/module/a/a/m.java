package com.anythink.expressad.video.module.a.a;

import android.text.TextUtils;
import com.anythink.expressad.video.module.AnythinkContainerView;
import com.anythink.expressad.video.module.AnythinkVideoView;

/* loaded from: classes.dex */
public final class m extends o {
    public static final long ai = 3000;
    private AnythinkVideoView ak;
    private AnythinkContainerView al;
    private int am;
    private final com.anythink.core.common.t.a an;
    private boolean ao;
    private boolean ap;
    private int aq;
    private int ar;
    private final com.anythink.core.common.t.b as;

    public m(AnythinkVideoView anythinkVideoView, AnythinkContainerView anythinkContainerView, com.anythink.expressad.foundation.d.d dVar, com.anythink.expressad.videocommon.c.c cVar, com.anythink.expressad.videocommon.b.c cVar2, String str, String str2, int i, int i4, com.anythink.expressad.video.module.a.a aVar, int i6, boolean z6, int i9) {
        super(dVar, cVar, cVar2, str, str2, aVar, i6, z6);
        this.an = com.anythink.core.common.t.d.a();
        this.ao = false;
        this.ap = false;
        this.aq = 1;
        this.as = new com.anythink.core.common.t.b() { // from class: com.anythink.expressad.video.module.a.a.m.1
            @Override // java.lang.Runnable
            public final void run() {
                m.this.al.showVideoClickView(-1);
                m.this.ak.soundOperate(0, 2);
            }
        };
        this.ak = anythinkVideoView;
        this.al = anythinkContainerView;
        this.ar = i;
        this.am = i4;
        this.aq = i9;
        if (anythinkVideoView != null) {
            this.ao = anythinkVideoView.getVideoSkipTime() == 0;
        }
        if (anythinkVideoView == null || anythinkContainerView == null) {
            this.Y = false;
        }
    }

    private void g() {
        this.an.b(this.as);
    }

    private void h() {
        g();
        this.an.a(this.as);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void i() {
        com.anythink.expressad.foundation.d.d dVar;
        com.anythink.expressad.foundation.d.d dVar2 = this.f22556Z;
        if (dVar2 == null || dVar2.k() != 5) {
            return;
        }
        AnythinkVideoView anythinkVideoView = this.ak;
        if (anythinkVideoView != null && anythinkVideoView.mCampOrderViewData != null) {
            int i = 0;
            int i4 = 0;
            while (true) {
                if (i4 < this.ak.mCampOrderViewData.size()) {
                    if (this.ak.mCampOrderViewData.get(i4) != null && this.ak.mCampOrderViewData.get(i4).bh() == this.f22556Z.bh()) {
                        i = i4 - 1;
                        break;
                    }
                    i4++;
                } else {
                    break;
                }
            }
            if (i >= 0 && this.ak.mCampOrderViewData.get(i) != null) {
                dVar = this.ak.mCampOrderViewData.get(i);
                if (dVar == null) {
                    AnythinkVideoView anythinkVideoView2 = this.ak;
                    if (anythinkVideoView2 != null) {
                        anythinkVideoView2.setCampaign(dVar);
                    }
                    AnythinkContainerView anythinkContainerView = this.al;
                    if (anythinkContainerView != null) {
                        anythinkContainerView.setCampaign(dVar);
                    }
                    a(dVar);
                    return;
                }
                return;
            }
        }
        dVar = null;
        if (dVar == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0183  */
    @Override // com.anythink.expressad.video.module.a.a.o, com.anythink.expressad.video.module.a.a.k, com.anythink.expressad.video.module.a.a.f, com.anythink.expressad.video.module.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(int i, Object obj) {
        com.anythink.expressad.foundation.d.d dVar;
        int i4;
        int i6;
        com.anythink.expressad.foundation.d.d dVar2;
        if (this.Y) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 5) {
                        if (i != 6) {
                            if (i != 8) {
                                switch (i) {
                                    case 10:
                                        this.ap = true;
                                        this.ak.soundOperate(0, 2);
                                        this.ak.progressOperate(0, 2);
                                        break;
                                    case 11:
                                        this.ak.videoOperate(3);
                                        this.ak.dismissAllAlert();
                                        if (this.f22556Z.G() == 3) {
                                            this.ak.setVisibility(0);
                                        } else if (this.f22556Z.e() != 2) {
                                            this.ak.setVisibility(8);
                                        }
                                        com.anythink.expressad.foundation.d.d dVar3 = this.f22556Z;
                                        if (dVar3 != null && dVar3.k() == 5) {
                                            AnythinkVideoView anythinkVideoView = this.ak;
                                            if (anythinkVideoView.mCurrPlayNum == anythinkVideoView.mCampaignSize) {
                                                AnythinkContainerView anythinkContainerView = this.al;
                                                if (anythinkContainerView != null) {
                                                    anythinkContainerView.setRewardStatus(true);
                                                    this.al.showOrderCampView();
                                                    break;
                                                }
                                            }
                                        }
                                        if (this.f22556Z.e() != 2) {
                                            this.al.showEndcard(this.f22556Z.G());
                                            break;
                                        } else {
                                            this.al.showVideoEndCover();
                                            break;
                                        }
                                        break;
                                    case 12:
                                        f();
                                        this.ak.videoOperate(3);
                                        this.ak.dismissAllAlert();
                                        if (this.f22556Z.G() != 3) {
                                            this.ak.setVisibility(8);
                                        } else {
                                            this.ak.setVisibility(0);
                                        }
                                        if (this.ap || this.aq != 0) {
                                            if (this.f22556Z.j() && this.f22556Z.k() == 5 && TextUtils.isEmpty(this.f22556Z.J())) {
                                                com.anythink.expressad.foundation.d.d dVar4 = this.f22556Z;
                                                if (dVar4 != null && dVar4.k() == 5) {
                                                    AnythinkVideoView anythinkVideoView2 = this.ak;
                                                    if (anythinkVideoView2 != null && anythinkVideoView2.mCampOrderViewData != null) {
                                                        int i9 = 0;
                                                        while (true) {
                                                            if (i9 >= this.ak.mCampOrderViewData.size()) {
                                                                i4 = 0;
                                                            } else if (this.ak.mCampOrderViewData.get(i9) == null || this.ak.mCampOrderViewData.get(i9).bh() != this.f22556Z.bh()) {
                                                                i9++;
                                                            } else {
                                                                i4 = i9 - 1;
                                                            }
                                                        }
                                                        if (i4 >= 0 && this.ak.mCampOrderViewData.get(i4) != null) {
                                                            dVar = this.ak.mCampOrderViewData.get(i4);
                                                            if (dVar != null) {
                                                                AnythinkVideoView anythinkVideoView3 = this.ak;
                                                                if (anythinkVideoView3 != null) {
                                                                    anythinkVideoView3.setCampaign(dVar);
                                                                }
                                                                AnythinkContainerView anythinkContainerView2 = this.al;
                                                                if (anythinkContainerView2 != null) {
                                                                    anythinkContainerView2.setCampaign(dVar);
                                                                }
                                                                a(dVar);
                                                            }
                                                        }
                                                    }
                                                    dVar = null;
                                                    if (dVar != null) {
                                                    }
                                                }
                                                this.aq = 0;
                                            }
                                            if (!this.ap && this.aq == 1) {
                                                e();
                                                d();
                                                c();
                                            }
                                            if (this.f22556Z.e() == 2) {
                                                this.al.showVideoEndCover();
                                                break;
                                            } else {
                                                this.al.showEndcard(this.f22556Z.G());
                                                break;
                                            }
                                        }
                                        break;
                                    case 13:
                                        this.ak.closeVideoOperate(0, 2);
                                        break;
                                    case 14:
                                        if (!this.ao) {
                                            this.ak.closeVideoOperate(0, 1);
                                            break;
                                        }
                                        break;
                                    case 15:
                                        if (obj != null && (obj instanceof AnythinkVideoView.a)) {
                                            AnythinkVideoView.a aVar = (AnythinkVideoView.a) obj;
                                            int videoInteractiveType = this.al.getVideoInteractiveType();
                                            if (this.f22556Z.e() == 2) {
                                                this.al.showVideoClickView(1);
                                            } else if (videoInteractiveType >= 0 && aVar.f22482a >= videoInteractiveType) {
                                                this.al.showVideoClickView(1);
                                                this.ak.soundOperate(0, 1);
                                            }
                                            this.ao = aVar.f22484c;
                                            if (this.f22556Z.k() != 5) {
                                                int i10 = this.am;
                                                if (((i10 >= 0 && ((i6 = aVar.f22482a) >= i10 || i6 == aVar.f22483b)) || (this.f22556Z.i() > 0 && (aVar.f22482a > this.f22556Z.i() || aVar.f22482a == aVar.f22483b))) && !this.ao) {
                                                    this.ak.closeVideoOperate(0, 2);
                                                    this.ao = true;
                                                    break;
                                                }
                                            } else {
                                                int i11 = aVar.f22482a;
                                                int i12 = aVar.f22483b;
                                                if (!this.ao && this.ak != null && (dVar2 = this.f22556Z) != null) {
                                                    int i13 = this.am;
                                                    char c9 = (i13 < 0 || i11 < i13) ? (char) 1 : (char) 2;
                                                    if (c9 != 2 && (dVar2.i() != 0 ? i11 > this.f22556Z.i() : this.ak.mCurrPlayNum > 1)) {
                                                        c9 = 2;
                                                    }
                                                    if (c9 != 2 && this.ak.mCurrPlayNum > 1 && i11 == i12) {
                                                        c9 = 2;
                                                    }
                                                    if (c9 == 2) {
                                                        this.ak.closeVideoOperate(0, 2);
                                                        this.ao = true;
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                        break;
                                }
                            } else {
                                AnythinkContainerView anythinkContainerView3 = this.al;
                                if (anythinkContainerView3 == null) {
                                    AnythinkVideoView anythinkVideoView4 = this.ak;
                                    if (anythinkVideoView4 != null) {
                                        anythinkVideoView4.showAlertView();
                                    }
                                } else if (anythinkContainerView3.showAlertWebView()) {
                                    AnythinkVideoView anythinkVideoView5 = this.ak;
                                    if (anythinkVideoView5 != null) {
                                        anythinkVideoView5.alertWebViewShowed();
                                    }
                                } else {
                                    AnythinkVideoView anythinkVideoView6 = this.ak;
                                    if (anythinkVideoView6 != null) {
                                        anythinkVideoView6.showAlertView();
                                    }
                                }
                            }
                        }
                    } else if (obj != null && (obj instanceof Integer)) {
                        this.ak.soundOperate((((Integer) obj).intValue() == 1 ? 2 : 1).intValue(), -1);
                    }
                }
                this.ak.dismissAllAlert();
                this.ak.videoOperate(3);
                com.anythink.expressad.foundation.d.d dVar5 = this.f22556Z;
                if (dVar5 != null && dVar5.j() && this.f22556Z.k() == 5 && this.al != null) {
                    AnythinkVideoView anythinkVideoView7 = this.ak;
                    if (anythinkVideoView7.mCurrPlayNum == anythinkVideoView7.mCampaignSize) {
                        if (this.f22556Z.e() != 2) {
                            this.al.setRewardStatus(true);
                            this.al.showOrderCampView();
                        }
                        i = 16;
                    }
                }
                if (this.ar == 2 && !this.al.endCardShowing() && this.f22556Z.e() != 2) {
                    this.al.showEndcard(this.f22556Z.G());
                }
                i = 16;
            } else if (!this.al.endCardShowing()) {
                int videoInteractiveType2 = this.al.getVideoInteractiveType();
                if (videoInteractiveType2 != -2) {
                    if (videoInteractiveType2 == -1) {
                        if (this.al.isLast()) {
                            this.al.showVideoClickView(1);
                            this.ak.soundOperate(0, 1);
                            g();
                            this.an.a(this.as);
                        } else {
                            this.al.showVideoClickView(-1);
                            this.ak.soundOperate(0, 2);
                            g();
                        }
                    }
                } else if (this.al.miniCardLoaded()) {
                    this.al.showVideoClickView(2);
                }
            }
        }
        super.a(i, obj);
    }

    private void a(int i, int i4) {
        com.anythink.expressad.foundation.d.d dVar;
        if (this.ao || this.ak == null || (dVar = this.f22556Z) == null) {
            return;
        }
        int i6 = this.am;
        char c9 = (i6 < 0 || i < i6) ? (char) 1 : (char) 2;
        if (c9 != 2 && (dVar.i() != 0 ? i > this.f22556Z.i() : this.ak.mCurrPlayNum > 1)) {
            c9 = 2;
        }
        if (c9 != 2 && this.ak.mCurrPlayNum > 1 && i == i4) {
            c9 = 2;
        }
        if (c9 == 2) {
            this.ak.closeVideoOperate(0, 2);
            this.ao = true;
        }
    }
}

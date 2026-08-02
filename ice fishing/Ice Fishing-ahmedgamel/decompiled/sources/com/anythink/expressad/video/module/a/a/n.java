package com.anythink.expressad.video.module.a.a;

import com.anythink.expressad.video.module.AnythinkVideoView;
import com.anythink.expressad.video.signal.factory.IJSFactory;

/* loaded from: classes.dex */
public final class n extends o {
    private IJSFactory ai;
    private int ak;
    private boolean al;
    private int am;
    private boolean an;

    public n(IJSFactory iJSFactory, com.anythink.expressad.foundation.d.d dVar, com.anythink.expressad.videocommon.c.c cVar, com.anythink.expressad.videocommon.b.c cVar2, String str, String str2, int i, int i4, com.anythink.expressad.video.module.a.a aVar, int i6, boolean z6, int i9) {
        super(dVar, cVar, cVar2, str, str2, aVar, i6, z6);
        this.al = false;
        this.an = false;
        this.ai = iJSFactory;
        this.ak = i;
        this.al = i4 == 0;
        this.am = i9;
        if (iJSFactory == null) {
            this.Y = false;
        }
    }

    @Override // com.anythink.expressad.video.module.a.a.o, com.anythink.expressad.video.module.a.a.k, com.anythink.expressad.video.module.a.a.f, com.anythink.expressad.video.module.a.a
    public final void a(int i, Object obj) {
        int i4;
        if (this.Y) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 5) {
                        if (i != 6) {
                            if (i != 8) {
                                if (i != 114) {
                                    if (i != 116) {
                                        switch (i) {
                                            case 10:
                                                this.an = true;
                                                this.ai.getJSNotifyProxy().a(0);
                                                break;
                                            case 11:
                                            case 12:
                                                this.ai.getJSVideoModule().videoOperate(3);
                                                if (this.f22556Z.G() == 3) {
                                                    this.ai.getJSVideoModule().setVisible(0);
                                                } else if (this.f22556Z.e() != 2) {
                                                    this.ai.getJSVideoModule().setVisible(8);
                                                }
                                                if (i == 12) {
                                                    f();
                                                    i4 = 2;
                                                } else {
                                                    i4 = 1;
                                                }
                                                this.ai.getJSNotifyProxy().a(i4);
                                                if (this.ai.getJSCommon().m() == 2) {
                                                    this.ai.getJSVideoModule().setVisible(0);
                                                    com.anythink.expressad.video.signal.j jSVideoModule = this.ai.getJSVideoModule();
                                                    this.ai.getJSContainerModule().showMiniCard(jSVideoModule.getBorderViewTop(), jSVideoModule.getBorderViewLeft(), jSVideoModule.getBorderViewWidth(), jSVideoModule.getBorderViewHeight(), jSVideoModule.getBorderViewRadius());
                                                } else if (i == 12) {
                                                    if (this.am == 1) {
                                                        if (this.f22556Z.e() != 2) {
                                                            this.ai.getJSContainerModule().showEndcard(this.f22556Z.G());
                                                        } else {
                                                            this.ai.getJSContainerModule().showVideoEndCover();
                                                        }
                                                    }
                                                } else if (this.f22556Z.e() != 2) {
                                                    this.ai.getJSContainerModule().showEndcard(this.f22556Z.G());
                                                } else {
                                                    this.ai.getJSContainerModule().showVideoEndCover();
                                                }
                                                this.ai.getJSVideoModule().dismissAllAlert();
                                                if (i == 12 && !this.an && this.am == 1) {
                                                    f();
                                                    e();
                                                    d();
                                                    c();
                                                    break;
                                                }
                                                break;
                                            case 13:
                                                if (!this.ai.getJSVideoModule().isH5Canvas()) {
                                                    this.ai.getJSVideoModule().closeVideoOperate(0, 2);
                                                }
                                                this.ai.getJSNotifyProxy().a(-1);
                                                break;
                                            case 14:
                                                if (!this.al) {
                                                    this.ai.getJSVideoModule().closeVideoOperate(0, 1);
                                                    break;
                                                }
                                                break;
                                            case 15:
                                                if (obj != null && (obj instanceof AnythinkVideoView.a)) {
                                                    this.al = true;
                                                    this.ai.getJSNotifyProxy().a((AnythinkVideoView.a) obj);
                                                    break;
                                                }
                                                break;
                                            default:
                                                switch (i) {
                                                    case 123:
                                                    case 124:
                                                        this.ai.getJSNotifyProxy().a(i == 123 ? 7 : 6, "");
                                                        break;
                                                    case 125:
                                                        this.ai.getJSContainerModule().hideAlertWebview();
                                                        break;
                                                }
                                        }
                                    } else {
                                        com.anythink.expressad.video.signal.j jSVideoModule2 = this.ai.getJSVideoModule();
                                        this.ai.getJSContainerModule().configurationChanged(jSVideoModule2.getBorderViewWidth(), jSVideoModule2.getBorderViewHeight(), jSVideoModule2.getBorderViewRadius());
                                    }
                                } else if (this.ai.getJSCommon().m() == 2) {
                                    com.anythink.expressad.video.signal.j jSVideoModule3 = this.ai.getJSVideoModule();
                                    this.ai.getJSContainerModule().showMiniCard(jSVideoModule3.getBorderViewTop(), jSVideoModule3.getBorderViewLeft(), jSVideoModule3.getBorderViewWidth(), jSVideoModule3.getBorderViewHeight(), jSVideoModule3.getBorderViewRadius());
                                }
                            } else if (this.ai.getJSContainerModule().showAlertWebView()) {
                                this.ai.getJSVideoModule().alertWebViewShowed();
                            } else {
                                this.ai.getJSVideoModule().showAlertView();
                            }
                        }
                    } else if (obj != null && (obj instanceof Integer)) {
                        Integer num = ((Integer) obj).intValue() == 1 ? 2 : 1;
                        this.ai.getJSVideoModule().soundOperate(num.intValue(), -1);
                        this.ai.getJSNotifyProxy().a(5, String.valueOf(num));
                    }
                }
                this.ai.getJSVideoModule().dismissAllAlert();
                if (i == 2) {
                    this.ai.getJSNotifyProxy().a(2, "");
                }
                this.ai.getJSVideoModule().videoOperate(3);
                if (this.ai.getJSCommon().m() != 2) {
                    if (this.f22556Z.G() != 3) {
                        this.ai.getJSVideoModule().setVisible(8);
                    } else {
                        this.ai.getJSVideoModule().setVisible(0);
                    }
                    if (this.ak == 2 && !this.ai.getJSContainerModule().endCardShowing() && this.f22556Z.e() != 2) {
                        this.ai.getJSContainerModule().showEndcard(this.f22556Z.G());
                        this.ai.getJSNotifyProxy().a(1);
                    }
                }
                i = 16;
                this.ai.getJSNotifyProxy().a(1);
            } else if (!this.ai.getJSContainerModule().endCardShowing()) {
                this.ai.getJSNotifyProxy().a(1, obj != null ? obj.toString() : "");
            }
        }
        super.a(i, obj);
    }
}

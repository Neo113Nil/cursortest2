package com.anythink.expressad.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.anythink.core.common.d.t;
import com.anythink.core.common.v.y;
import com.anythink.expressad.f.b;
import com.anythink.expressad.foundation.d.d;
import com.anythink.expressad.foundation.g.d.c;
import com.anythink.expressad.out.k;

/* loaded from: classes.dex */
public class ATAdChoice extends ATImageView {

    /* renamed from: a, reason: collision with root package name */
    private static final String f23270a = "MBAdChoice";

    /* renamed from: b, reason: collision with root package name */
    private String f23271b;

    /* renamed from: c, reason: collision with root package name */
    private String f23272c;

    /* renamed from: d, reason: collision with root package name */
    private String f23273d;

    /* renamed from: e, reason: collision with root package name */
    private final Context f23274e;

    /* renamed from: com.anythink.expressad.widget.ATAdChoice$1, reason: invalid class name */
    public class AnonymousClass1 implements c {
        public AnonymousClass1() {
        }

        @Override // com.anythink.expressad.foundation.g.d.c
        public final void a(String str, String str2) {
        }

        @Override // com.anythink.expressad.foundation.g.d.c
        public final void a(Bitmap bitmap, String str) {
            ATAdChoice.this.setImageBitmap(bitmap);
        }
    }

    public ATAdChoice(Context context) {
        super(context);
        this.f23271b = "";
        this.f23272c = "";
        this.f23273d = "";
        this.f23274e = context;
        a();
    }

    private void a() {
        setScaleType(ImageView.ScaleType.FIT_CENTER);
        setClickable(true);
    }

    private void b(d dVar, com.anythink.expressad.f.a aVar) {
        if (dVar == null) {
            if (aVar != null) {
                this.f23271b = aVar.H();
                return;
            }
            return;
        }
        d.a w3 = dVar.w();
        if (w3 != null) {
            this.f23271b = w3.c();
        }
        if (!TextUtils.isEmpty(this.f23271b) || aVar == null) {
            return;
        }
        this.f23271b = aVar.H();
    }

    private void c(d dVar, com.anythink.expressad.f.a aVar) {
        if (dVar == null) {
            if (aVar != null) {
                this.f23273d = aVar.J();
                return;
            }
            return;
        }
        String h3 = dVar.h();
        this.f23273d = h3;
        if (TextUtils.isEmpty(h3)) {
            d.a w3 = dVar.w();
            if (w3 != null) {
                this.f23273d = w3.b();
            }
            if (!TextUtils.isEmpty(this.f23273d) || aVar == null) {
                return;
            }
            this.f23273d = aVar.J();
        }
    }

    @Override // android.view.View
    public boolean performClick() {
        if (TextUtils.isEmpty(this.f23273d)) {
            return true;
        }
        y.a(t.b().g(), this.f23273d);
        return true;
    }

    public void setCampaign(k kVar) {
        if (kVar instanceof d) {
            d dVar = (d) kVar;
            b.a();
            com.anythink.expressad.foundation.b.a.c().f();
            com.anythink.expressad.f.a b9 = b.b();
            if (dVar != null) {
                String h3 = dVar.h();
                this.f23273d = h3;
                if (TextUtils.isEmpty(h3)) {
                    d.a w3 = dVar.w();
                    if (w3 != null) {
                        this.f23273d = w3.b();
                    }
                    if (TextUtils.isEmpty(this.f23273d) && b9 != null) {
                        this.f23273d = b9.J();
                    }
                }
            } else if (b9 != null) {
                this.f23273d = b9.J();
            }
            if (dVar != null) {
                d.a w6 = dVar.w();
                if (w6 != null) {
                    this.f23271b = w6.c();
                }
                if (TextUtils.isEmpty(this.f23271b) && b9 != null) {
                    this.f23271b = b9.H();
                }
            } else if (b9 != null) {
                this.f23271b = b9.H();
            }
            if (dVar != null) {
                d.a w9 = dVar.w();
                if (w9 != null) {
                    this.f23272c = w9.d();
                }
                if (TextUtils.isEmpty(this.f23272c) && b9 != null) {
                    this.f23272c = b9.I();
                }
            } else if (b9 != null) {
                this.f23272c = b9.I();
            }
            boolean z6 = (TextUtils.isEmpty(this.f23271b) || TextUtils.isEmpty(this.f23273d) || TextUtils.isEmpty(this.f23272c)) ? false : true;
            setImageUrl(this.f23271b);
            if (!z6 || this.f23274e == null) {
                return;
            }
            com.IceFishing.LiveIceFishing.k.m().a(this.f23271b, new AnonymousClass1());
        }
    }

    private boolean a(d dVar) {
        b.a();
        com.anythink.expressad.foundation.b.a.c().f();
        com.anythink.expressad.f.a b9 = b.b();
        if (dVar != null) {
            String h3 = dVar.h();
            this.f23273d = h3;
            if (TextUtils.isEmpty(h3)) {
                d.a w3 = dVar.w();
                if (w3 != null) {
                    this.f23273d = w3.b();
                }
                if (TextUtils.isEmpty(this.f23273d) && b9 != null) {
                    this.f23273d = b9.J();
                }
            }
        } else if (b9 != null) {
            this.f23273d = b9.J();
        }
        if (dVar != null) {
            d.a w6 = dVar.w();
            if (w6 != null) {
                this.f23271b = w6.c();
            }
            if (TextUtils.isEmpty(this.f23271b) && b9 != null) {
                this.f23271b = b9.H();
            }
        } else if (b9 != null) {
            this.f23271b = b9.H();
        }
        if (dVar != null) {
            d.a w9 = dVar.w();
            if (w9 != null) {
                this.f23272c = w9.d();
            }
            if (TextUtils.isEmpty(this.f23272c) && b9 != null) {
                this.f23272c = b9.I();
            }
        } else if (b9 != null) {
            this.f23272c = b9.I();
        }
        boolean z6 = (TextUtils.isEmpty(this.f23271b) || TextUtils.isEmpty(this.f23273d) || TextUtils.isEmpty(this.f23272c)) ? false : true;
        setImageUrl(this.f23271b);
        return z6;
    }

    private void b() {
        if (this.f23274e != null) {
            com.IceFishing.LiveIceFishing.k.m().a(this.f23271b, new AnonymousClass1());
        }
    }

    public ATAdChoice(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23271b = "";
        this.f23272c = "";
        this.f23273d = "";
        this.f23274e = context;
        a();
    }

    private void c() {
        if (TextUtils.isEmpty(this.f23273d)) {
            return;
        }
        y.a(t.b().g(), this.f23273d);
    }

    public ATAdChoice(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f23271b = "";
        this.f23272c = "";
        this.f23273d = "";
        this.f23274e = context;
        a();
    }

    private void a(d dVar, com.anythink.expressad.f.a aVar) {
        if (dVar == null) {
            if (aVar != null) {
                this.f23272c = aVar.I();
                return;
            }
            return;
        }
        d.a w3 = dVar.w();
        if (w3 != null) {
            this.f23272c = w3.d();
        }
        if (!TextUtils.isEmpty(this.f23272c) || aVar == null) {
            return;
        }
        this.f23272c = aVar.I();
    }
}

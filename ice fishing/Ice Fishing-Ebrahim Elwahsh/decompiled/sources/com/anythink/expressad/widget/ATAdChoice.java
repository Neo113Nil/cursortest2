package com.anythink.expressad.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.anythink.basead.b.c.i;
import com.anythink.core.common.d.t;
import com.anythink.core.common.v.y;
import com.anythink.expressad.f.b;
import com.anythink.expressad.foundation.d.d;
import com.anythink.expressad.foundation.g.d.c;
import com.anythink.expressad.out.k;

/* loaded from: classes.dex */
public class ATAdChoice extends ATImageView {

    /* renamed from: a, reason: collision with root package name */
    private static final String f22641a = "MBAdChoice";

    /* renamed from: b, reason: collision with root package name */
    private String f22642b;

    /* renamed from: c, reason: collision with root package name */
    private String f22643c;

    /* renamed from: d, reason: collision with root package name */
    private String f22644d;

    /* renamed from: e, reason: collision with root package name */
    private final Context f22645e;

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
        this.f22642b = "";
        this.f22643c = "";
        this.f22644d = "";
        this.f22645e = context;
        a();
    }

    private void a() {
        setScaleType(ImageView.ScaleType.FIT_CENTER);
        setClickable(true);
    }

    private void b(d dVar, com.anythink.expressad.f.a aVar) {
        if (dVar == null) {
            if (aVar != null) {
                this.f22642b = aVar.H();
                return;
            }
            return;
        }
        d.a w9 = dVar.w();
        if (w9 != null) {
            this.f22642b = w9.c();
        }
        if (!TextUtils.isEmpty(this.f22642b) || aVar == null) {
            return;
        }
        this.f22642b = aVar.H();
    }

    private void c(d dVar, com.anythink.expressad.f.a aVar) {
        if (dVar == null) {
            if (aVar != null) {
                this.f22644d = aVar.J();
                return;
            }
            return;
        }
        String h9 = dVar.h();
        this.f22644d = h9;
        if (TextUtils.isEmpty(h9)) {
            d.a w9 = dVar.w();
            if (w9 != null) {
                this.f22644d = w9.b();
            }
            if (!TextUtils.isEmpty(this.f22644d) || aVar == null) {
                return;
            }
            this.f22644d = aVar.J();
        }
    }

    @Override // android.view.View
    public boolean performClick() {
        if (TextUtils.isEmpty(this.f22644d)) {
            return true;
        }
        y.a(t.b().g(), this.f22644d);
        return true;
    }

    public void setCampaign(k kVar) {
        if (kVar instanceof d) {
            d dVar = (d) kVar;
            b.a();
            com.anythink.expressad.foundation.b.a.c().f();
            com.anythink.expressad.f.a b9 = b.b();
            if (dVar != null) {
                String h9 = dVar.h();
                this.f22644d = h9;
                if (TextUtils.isEmpty(h9)) {
                    d.a w9 = dVar.w();
                    if (w9 != null) {
                        this.f22644d = w9.b();
                    }
                    if (TextUtils.isEmpty(this.f22644d) && b9 != null) {
                        this.f22644d = b9.J();
                    }
                }
            } else if (b9 != null) {
                this.f22644d = b9.J();
            }
            if (dVar != null) {
                d.a w10 = dVar.w();
                if (w10 != null) {
                    this.f22642b = w10.c();
                }
                if (TextUtils.isEmpty(this.f22642b) && b9 != null) {
                    this.f22642b = b9.H();
                }
            } else if (b9 != null) {
                this.f22642b = b9.H();
            }
            if (dVar != null) {
                d.a w11 = dVar.w();
                if (w11 != null) {
                    this.f22643c = w11.d();
                }
                if (TextUtils.isEmpty(this.f22643c) && b9 != null) {
                    this.f22643c = b9.I();
                }
            } else if (b9 != null) {
                this.f22643c = b9.I();
            }
            boolean z8 = (TextUtils.isEmpty(this.f22642b) || TextUtils.isEmpty(this.f22644d) || TextUtils.isEmpty(this.f22643c)) ? false : true;
            setImageUrl(this.f22642b);
            if (!z8 || this.f22645e == null) {
                return;
            }
            i.m().a(this.f22642b, new AnonymousClass1());
        }
    }

    private boolean a(d dVar) {
        b.a();
        com.anythink.expressad.foundation.b.a.c().f();
        com.anythink.expressad.f.a b9 = b.b();
        if (dVar != null) {
            String h9 = dVar.h();
            this.f22644d = h9;
            if (TextUtils.isEmpty(h9)) {
                d.a w9 = dVar.w();
                if (w9 != null) {
                    this.f22644d = w9.b();
                }
                if (TextUtils.isEmpty(this.f22644d) && b9 != null) {
                    this.f22644d = b9.J();
                }
            }
        } else if (b9 != null) {
            this.f22644d = b9.J();
        }
        if (dVar != null) {
            d.a w10 = dVar.w();
            if (w10 != null) {
                this.f22642b = w10.c();
            }
            if (TextUtils.isEmpty(this.f22642b) && b9 != null) {
                this.f22642b = b9.H();
            }
        } else if (b9 != null) {
            this.f22642b = b9.H();
        }
        if (dVar != null) {
            d.a w11 = dVar.w();
            if (w11 != null) {
                this.f22643c = w11.d();
            }
            if (TextUtils.isEmpty(this.f22643c) && b9 != null) {
                this.f22643c = b9.I();
            }
        } else if (b9 != null) {
            this.f22643c = b9.I();
        }
        boolean z8 = (TextUtils.isEmpty(this.f22642b) || TextUtils.isEmpty(this.f22644d) || TextUtils.isEmpty(this.f22643c)) ? false : true;
        setImageUrl(this.f22642b);
        return z8;
    }

    private void b() {
        if (this.f22645e != null) {
            i.m().a(this.f22642b, new AnonymousClass1());
        }
    }

    public ATAdChoice(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22642b = "";
        this.f22643c = "";
        this.f22644d = "";
        this.f22645e = context;
        a();
    }

    private void c() {
        if (TextUtils.isEmpty(this.f22644d)) {
            return;
        }
        y.a(t.b().g(), this.f22644d);
    }

    public ATAdChoice(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f22642b = "";
        this.f22643c = "";
        this.f22644d = "";
        this.f22645e = context;
        a();
    }

    private void a(d dVar, com.anythink.expressad.f.a aVar) {
        if (dVar == null) {
            if (aVar != null) {
                this.f22643c = aVar.I();
                return;
            }
            return;
        }
        d.a w9 = dVar.w();
        if (w9 != null) {
            this.f22643c = w9.d();
        }
        if (!TextUtils.isEmpty(this.f22643c) || aVar == null) {
            return;
        }
        this.f22643c = aVar.I();
    }
}

package com.anythink.expressad.video.module;

import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.IceFishing.LiveIceFishing.k;
import com.anythink.core.common.d.t;
import com.anythink.expressad.foundation.d.d;
import com.anythink.expressad.foundation.h.v;
import com.anythink.expressad.video.module.a.a;
import com.anythink.expressad.video.module.a.a.j;
import com.anythink.expressad.video.signal.f;
import com.anythink.expressad.video.signal.factory.b;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class AnythinkVideoEndCoverView extends AnythinkBaseView implements f {

    /* renamed from: n, reason: collision with root package name */
    private final String f22412n;

    /* renamed from: o, reason: collision with root package name */
    private View f22413o;

    /* renamed from: p, reason: collision with root package name */
    private ImageView f22414p;

    /* renamed from: q, reason: collision with root package name */
    private ImageView f22415q;

    /* renamed from: r, reason: collision with root package name */
    private TextView f22416r;

    /* renamed from: s, reason: collision with root package name */
    private TextView f22417s;

    /* renamed from: t, reason: collision with root package name */
    private TextView f22418t;

    /* renamed from: u, reason: collision with root package name */
    private b f22419u;

    public AnythinkVideoEndCoverView(Context context) {
        super(context);
        this.f22412n = "AnythinkVideoEndCoverView";
    }

    private boolean a(View view) {
        if (view == null) {
            return true;
        }
        try {
            this.f22414p = (ImageView) view.findViewById(findID("anythink_vec_iv_icon"));
            this.f22415q = (ImageView) view.findViewById(findID("anythink_vec_iv_close"));
            this.f22416r = (TextView) view.findViewById(findID("anythink_vec_tv_title"));
            this.f22417s = (TextView) view.findViewById(findID("anythink_vec_tv_desc"));
            this.f22418t = (TextView) view.findViewById(findID("anythink_vec_btn"));
            return true;
        } catch (Throwable th) {
            th.getMessage();
            return false;
        }
    }

    private void b() {
        View view = this.f22413o;
        if (view == null) {
            init(this.f22228a);
            preLoadData(this.f22419u);
            return;
        }
        if (view.getParent() != null) {
            ((ViewGroup) this.f22413o.getParent()).removeView(this.f22413o);
        }
        addView(this.f22413o);
        a(this.f22413o);
        c();
    }

    private void e() {
        ImageView imageView;
        d dVar = this.f22229b;
        if (dVar != null) {
            if (!TextUtils.isEmpty(dVar.bl()) && (imageView = this.f22414p) != null) {
                com.anythink.expressad.foundation.g.d.b.a(this.f22228a.getApplicationContext()).a(this.f22229b.bl(), new j(imageView, k.e(8.0f)));
            }
            TextView textView = this.f22416r;
            if (textView != null) {
                textView.setText(this.f22229b.bj());
            }
            TextView textView2 = this.f22418t;
            if (textView2 != null) {
                textView2.setText(this.f22229b.dj);
            }
            TextView textView3 = this.f22417s;
            if (textView3 != null) {
                textView3.setText(this.f22229b.bk());
            }
        }
    }

    @Override // com.anythink.expressad.video.module.AnythinkBaseView
    public final void c() {
        super.c();
        this.f22415q.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.expressad.video.module.AnythinkVideoEndCoverView.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                a aVar = AnythinkVideoEndCoverView.this.f22232e;
                if (aVar != null) {
                    aVar.a(104, "");
                }
            }
        });
        this.f22414p.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.expressad.video.module.AnythinkVideoEndCoverView.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AnythinkVideoEndCoverView.this.a();
            }
        });
        this.f22418t.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.expressad.video.module.AnythinkVideoEndCoverView.3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AnythinkVideoEndCoverView.this.a();
            }
        });
    }

    @Override // com.anythink.expressad.video.module.AnythinkBaseView
    public void init(Context context) {
        int findLayout = findLayout("anythink_reward_videoend_cover");
        if (findLayout >= 0) {
            View inflate = this.f22230c.inflate(findLayout, (ViewGroup) null);
            this.f22413o = inflate;
            if (inflate != null) {
                this.f22233f = a(inflate);
                addView(this.f22413o, -1, -1);
                c();
            }
        }
    }

    @Override // com.anythink.expressad.video.module.AnythinkBaseView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f22234g = motionEvent.getRawX();
        this.f22235h = motionEvent.getRawY();
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // com.anythink.expressad.video.module.AnythinkBaseView
    public void onSelfConfigurationChanged(Configuration configuration) {
        super.onSelfConfigurationChanged(configuration);
        this.f22231d = configuration.orientation;
        removeView(this.f22413o);
        View view = this.f22413o;
        if (view == null) {
            init(this.f22228a);
            preLoadData(this.f22419u);
            return;
        }
        if (view.getParent() != null) {
            ((ViewGroup) this.f22413o.getParent()).removeView(this.f22413o);
        }
        addView(this.f22413o);
        a(this.f22413o);
        c();
    }

    @Override // com.anythink.expressad.video.signal.f
    public void preLoadData(b bVar) {
        ImageView imageView;
        this.f22419u = bVar;
        try {
            d dVar = this.f22229b;
            if (dVar == null || !this.f22233f || dVar == null) {
                return;
            }
            if (!TextUtils.isEmpty(dVar.bl()) && (imageView = this.f22414p) != null) {
                com.anythink.expressad.foundation.g.d.b.a(this.f22228a.getApplicationContext()).a(this.f22229b.bl(), new j(imageView, v.b(t.b().g(), 8.0f)));
            }
            TextView textView = this.f22416r;
            if (textView != null) {
                textView.setText(this.f22229b.bj());
            }
            TextView textView2 = this.f22418t;
            if (textView2 != null) {
                textView2.setText(this.f22229b.dj);
            }
            TextView textView3 = this.f22417s;
            if (textView3 != null) {
                textView3.setText(this.f22229b.bk());
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public AnythinkVideoEndCoverView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22412n = "AnythinkVideoEndCoverView";
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        JSONObject jSONObject;
        JSONException e9;
        a aVar;
        JSONObject jSONObject2;
        JSONException e10;
        try {
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put(com.anythink.expressad.foundation.g.a.cg, v.a(t.b().g(), this.f22234g));
                    jSONObject2.put(com.anythink.expressad.foundation.g.a.ch, v.a(t.b().g(), this.f22235h));
                    jSONObject2.put(com.anythink.expressad.foundation.g.a.cj, 0);
                    try {
                        this.f22231d = getContext().getResources().getConfiguration().orientation;
                    } catch (Exception e11) {
                        e11.printStackTrace();
                    }
                    jSONObject2.put(com.anythink.expressad.foundation.g.a.ck, this.f22231d);
                    jSONObject2.put(com.anythink.expressad.foundation.g.a.cl, v.c(getContext()));
                } catch (JSONException e12) {
                    e10 = e12;
                    e10.getMessage();
                    jSONObject = new JSONObject();
                    jSONObject.put(com.anythink.expressad.foundation.g.a.ci, jSONObject2);
                    aVar = this.f22232e;
                    if (aVar != null) {
                    }
                }
            } catch (JSONException e13) {
                jSONObject2 = jSONObject3;
                e10 = e13;
            }
            jSONObject = new JSONObject();
            try {
                jSONObject.put(com.anythink.expressad.foundation.g.a.ci, jSONObject2);
            } catch (JSONException e14) {
                e9 = e14;
                e9.printStackTrace();
                aVar = this.f22232e;
                if (aVar != null) {
                }
            }
        } catch (JSONException e15) {
            jSONObject = null;
            e9 = e15;
        }
        aVar = this.f22232e;
        if (aVar != null) {
            aVar.a(105, jSONObject);
        }
    }
}

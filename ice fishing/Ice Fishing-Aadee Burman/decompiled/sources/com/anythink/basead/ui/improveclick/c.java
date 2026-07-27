package com.anythink.basead.ui.improveclick;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.x;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: d, reason: collision with root package name */
    protected Context f11138d;

    /* renamed from: e, reason: collision with root package name */
    protected w f11139e;

    /* renamed from: f, reason: collision with root package name */
    protected x f11140f;

    /* renamed from: g, reason: collision with root package name */
    protected ViewGroup f11141g;

    /* renamed from: h, reason: collision with root package name */
    protected int f11142h;
    RelativeLayout i;

    /* renamed from: j, reason: collision with root package name */
    View f11143j;

    /* renamed from: k, reason: collision with root package name */
    protected a f11144k;

    public interface a {
        void a(int i, int i6);
    }

    public interface b extends a {
        void a();

        void a(long j6);

        void b();
    }

    public abstract void a();

    public abstract void a(int i, Map<String, Object> map);

    public void a(Context context, w wVar, x xVar, ViewGroup viewGroup, RelativeLayout relativeLayout, View view, int i, a aVar) {
        this.f11138d = context;
        this.f11139e = wVar;
        this.f11140f = xVar;
        this.f11141g = viewGroup;
        this.f11142h = i;
        this.f11144k = aVar;
        this.i = relativeLayout;
        this.f11143j = view;
    }

    public static boolean a(Map<String, Object> map) {
        Object obj;
        if (map == null || (obj = map.get("key_has_endcard_improve")) == null || !(obj instanceof Boolean)) {
            return false;
        }
        return ((Boolean) obj).booleanValue();
    }
}

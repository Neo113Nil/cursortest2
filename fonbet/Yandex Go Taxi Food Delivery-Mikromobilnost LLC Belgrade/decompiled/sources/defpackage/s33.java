package defpackage;

import android.app.Activity;
import androidx.lifecycle.DefaultLifecycleObserver;
import com.google.ar.core.Anchor;
import com.google.ar.core.Plane;
import com.google.ar.core.Pose;
import com.google.ar.core.Session;
import com.google.ar.core.TrackingState;
import com.yandex.smartcamera.arscene.ar_core.helpers.DisplayRotationHelper;
import com.yandex.smartcamera.arscene.ar_core.helpers.TapHelper;
import com.yandex.smartcamera.arscene.ar_core.helpers.b;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class s33 implements vyl0, DefaultLifecycleObserver {
    public int B;
    public boolean C;
    public nhc0 D;
    public yh4 E;
    public hsu0 F;
    public boolean G;
    public r2x0 H;
    public zr10 I;
    public yfr0 J;
    public long K;
    public boolean L;
    public m33 M;
    public zr10 N;
    public yfr0 O;
    public uxj P;
    public Anchor Q;
    public uxj R;
    public gpt0 S;
    public final Activity a;
    public final DisplayRotationHelper a0;
    public final l1 b;
    public final kcz0 b0;
    public final TapHelper c;
    public final b c0;
    public final m33 w;
    public final tls x;
    public final sls y;
    public final ttm z;
    public final float[] A = new float[16];
    public final float[] T = new float[16];
    public final float[] U = new float[16];
    public final float[] V = new float[16];
    public final float[] W = new float[16];
    public final float[] Z = new float[16];

    public s33(Activity activity, l1 l1Var, TapHelper tapHelper, m33 m33Var, tls tlsVar, sls slsVar, ttm ttmVar) {
        this.a = activity;
        this.b = l1Var;
        this.c = tapHelper;
        this.w = m33Var;
        this.x = tlsVar;
        this.y = slsVar;
        this.z = ttmVar;
        this.M = m33Var;
        this.a0 = new DisplayRotationHelper(activity);
        this.b0 = new kcz0(activity);
        this.c0 = new b(this.M);
        tapHelper.setRotationCallback(new g191(this));
    }

    public static boolean b(Session session) {
        Collection allTrackables = session.getAllTrackables(Plane.class);
        if (allTrackables.isEmpty()) {
            return false;
        }
        Iterator it = allTrackables.iterator();
        while (it.hasNext()) {
            if (((Plane) it.next()).getTrackingState() == TrackingState.TRACKING) {
                return true;
            }
        }
        return false;
    }

    public final float a(Pose pose) {
        float tx = pose.tx();
        float[] fArr = this.A;
        float f = tx - fArr[12];
        float ty = pose.ty() - fArr[13];
        float tz = pose.tz() - fArr[14];
        return (float) Math.sqrt((tz * tz) + (ty * ty) + (f * f));
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onPause(pey peyVar) {
        this.a0.onPause();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(pey peyVar) {
        this.a0.onResume();
        this.G = false;
    }
}

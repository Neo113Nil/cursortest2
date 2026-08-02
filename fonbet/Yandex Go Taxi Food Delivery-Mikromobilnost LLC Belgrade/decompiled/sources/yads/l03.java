package yads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLSurfaceView;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.View;
import android.view.WindowManager;
import defpackage.fe71;
import defpackage.jy31;
import defpackage.rf71;
import defpackage.rm81;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes7.dex */
public final class l03 extends GLSurfaceView {
    public final CopyOnWriteArrayList a;
    public final SensorManager b;
    public final Sensor c;
    public final i92 d;
    public final Handler e;
    public final rm81 f;
    public SurfaceTexture g;
    public Surface h;
    public boolean i;
    public boolean j;
    public boolean k;

    public l03(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new CopyOnWriteArrayList();
        this.e = new Handler(Looper.getMainLooper());
        Object systemService = context.getSystemService("sensor");
        systemService.getClass();
        SensorManager sensorManager = (SensorManager) systemService;
        this.b = sensorManager;
        Sensor defaultSensor = rf71.a >= 18 ? sensorManager.getDefaultSensor(15) : null;
        this.c = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        rm81 rm81Var = new rm81();
        this.f = rm81Var;
        j03 j03Var = new j03(this, rm81Var);
        View.OnTouchListener i53Var = new i53(context, j03Var);
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        windowManager.getClass();
        this.d = new i92(windowManager.getDefaultDisplay(), i53Var, j03Var);
        this.i = true;
        setEGLContextClientVersion(2);
        setRenderer(j03Var);
        setOnTouchListener(i53Var);
    }

    public final void a(SurfaceTexture surfaceTexture) {
        SurfaceTexture surfaceTexture2 = this.g;
        Surface surface = this.h;
        Surface surface2 = new Surface(surfaceTexture);
        this.g = surfaceTexture;
        this.h = surface2;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((gn0) it.next()).a.f(surface2);
        }
        if (surfaceTexture2 != null) {
            surfaceTexture2.release();
        }
        if (surface != null) {
            surface.release();
        }
    }

    public final void b() {
        boolean z = this.i && this.j;
        Sensor sensor = this.c;
        if (sensor == null || z == this.k) {
            return;
        }
        SensorManager sensorManager = this.b;
        if (z) {
            sensorManager.registerListener(this.d, sensor, 0);
        } else {
            sensorManager.unregisterListener(this.d);
        }
        this.k = z;
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.e.post(new jy31(26, this));
    }

    @Override // android.opengl.GLSurfaceView
    public final void onPause() {
        this.j = false;
        b();
        super.onPause();
    }

    @Override // android.opengl.GLSurfaceView
    public final void onResume() {
        super.onResume();
        this.j = true;
        b();
    }

    public void setDefaultStereoMode(int i) {
        this.f.D = i;
    }

    public void setUseSensorRotation(boolean z) {
        this.i = z;
        b();
    }

    public final void b(SurfaceTexture surfaceTexture) {
        this.e.post(new fe71(4, this, surfaceTexture));
    }

    public final void a() {
        Surface surface = this.h;
        if (surface != null) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((gn0) it.next()).a.f(null);
            }
        }
        SurfaceTexture surfaceTexture = this.g;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        if (surface != null) {
            surface.release();
        }
        this.g = null;
        this.h = null;
    }

    public l03(Context context) {
        this(context, null);
    }
}

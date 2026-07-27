package com.giderosmobile.android;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ConfigurationInfo;
import android.opengl.GLSurfaceView;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import com.giderosmobile.android.player.GiderosApplication;
import com.giderosmobile.android.player.GiderosConfigChooser;
import java.lang.reflect.Method;

/* compiled from: ifd2Activity.java */
/* loaded from: classes.dex */
class GiderosGLSurfaceView extends GLSurfaceView {
    GiderosRenderer mRenderer;

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005f, code lost:
    
        r4.invoke(r7, true);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public GiderosGLSurfaceView(Context context) {
        super(context);
        if (GiderosSettings.translucentCanvas) {
            getHolder().setFormat(-3);
            setZOrderOnTop(true);
        }
        ConfigurationInfo deviceConfigurationInfo = ((ActivityManager) context.getSystemService("activity")).getDeviceConfigurationInfo();
        setEGLContextClientVersion((deviceConfigurationInfo.reqGlEsVersion != 0 ? deviceConfigurationInfo.reqGlEsVersion : 65536) >= 196608 ? 3 : 2);
        setEGLConfigChooser(new GiderosConfigChooser());
        GiderosRenderer giderosRenderer = new GiderosRenderer();
        this.mRenderer = giderosRenderer;
        setRenderer(giderosRenderer);
        try {
            Method[] methods = getClass().getMethods();
            int length = methods.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                Method method = methods[i];
                if (method.getName().equals("setPreserveEGLContextOnPause")) {
                    break;
                } else {
                    i++;
                }
            }
        } catch (Exception unused) {
        }
        setFocusable(true);
        setFocusableInTouchMode(true);
    }

    @Override // android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return GiderosApplication.getInstance().onCreateInputConnection(editorInfo);
    }

    @Override // android.view.View
    public boolean onCheckIsTextEditor() {
        return GiderosApplication.getInstance().onCheckIsTextEditor();
    }

    @Override // android.view.View
    public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        GiderosApplication giderosApplication;
        if (keyEvent.getKeyCode() == 4 && (giderosApplication = GiderosApplication.getInstance()) != null) {
            int action = keyEvent.getAction();
            if (action == 0 && giderosApplication.onKeyDown(i, keyEvent)) {
                return true;
            }
            if (action == 1 && giderosApplication.onKeyUp(i, keyEvent)) {
                return true;
            }
        }
        return super.onKeyPreIme(i, keyEvent);
    }
}

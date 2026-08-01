package com.anythink.expressad.video.dynview.i;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import com.anythink.core.common.d.t;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static volatile b f21224a;

    private static b a() {
        if (f21224a == null) {
            synchronized (b.class) {
                try {
                    if (f21224a == null) {
                        f21224a = new b();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f21224a;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0068 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0063 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x005e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0059 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static Bitmap a(Bitmap bitmap, int i) {
        Allocation allocation;
        RenderScript renderScript;
        ScriptIntrinsicBlur scriptIntrinsicBlur;
        Allocation allocation2;
        Bitmap createBitmap;
        try {
            createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_4444);
            renderScript = RenderScript.create(t.b().g());
        } catch (Throwable unused) {
            allocation = null;
            renderScript = null;
            scriptIntrinsicBlur = null;
        }
        try {
            scriptIntrinsicBlur = ScriptIntrinsicBlur.create(renderScript, Element.U8_4(renderScript));
            try {
                allocation = Allocation.createFromBitmap(renderScript, bitmap);
                try {
                    allocation2 = Allocation.createFromBitmap(renderScript, createBitmap);
                    try {
                        scriptIntrinsicBlur.setRadius(18.0f);
                        scriptIntrinsicBlur.setInput(allocation);
                        scriptIntrinsicBlur.forEach(allocation2);
                        allocation2.copyTo(createBitmap);
                        if (renderScript != null) {
                            try {
                                renderScript.destroy();
                            } catch (Throwable unused2) {
                            }
                        }
                        try {
                            scriptIntrinsicBlur.destroy();
                        } catch (Throwable unused3) {
                        }
                        if (allocation != null) {
                            try {
                                allocation.destroy();
                            } catch (Throwable unused4) {
                            }
                        }
                        try {
                            allocation2.destroy();
                        } catch (Throwable unused5) {
                        }
                        return createBitmap;
                    } catch (Throwable unused6) {
                        if (renderScript != null) {
                            try {
                                renderScript.destroy();
                            } catch (Throwable unused7) {
                            }
                        }
                        if (scriptIntrinsicBlur != null) {
                            try {
                                scriptIntrinsicBlur.destroy();
                            } catch (Throwable unused8) {
                            }
                        }
                        if (allocation != null) {
                            try {
                                allocation.destroy();
                            } catch (Throwable unused9) {
                            }
                        }
                        if (allocation2 != null) {
                            try {
                                allocation2.destroy();
                            } catch (Throwable unused10) {
                            }
                        }
                        return null;
                    }
                } catch (Throwable unused11) {
                    allocation2 = null;
                }
            } catch (Throwable unused12) {
                allocation = null;
                allocation2 = null;
            }
        } catch (Throwable unused13) {
            allocation = null;
            scriptIntrinsicBlur = null;
            allocation2 = scriptIntrinsicBlur;
            if (renderScript != null) {
            }
            if (scriptIntrinsicBlur != null) {
            }
            if (allocation != null) {
            }
            if (allocation2 != null) {
            }
            return null;
        }
    }

    private static Bitmap a(int i) {
        try {
            Bitmap createBitmap = Bitmap.createBitmap(100, 100, Bitmap.Config.ARGB_4444);
            if (i == 1) {
                createBitmap.eraseColor(Color.parseColor("#FF0000"));
                return createBitmap;
            }
            createBitmap.eraseColor(Color.parseColor("#FFFFFF"));
            return createBitmap;
        } catch (Exception e9) {
            if (com.anythink.expressad.a.f17618a) {
                e9.printStackTrace();
            }
            return null;
        }
    }
}

package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.Base64;
import com.google.android.gms.internal.ads.C2524Ch;
import java.io.ByteArrayOutputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.consent_sdk.p, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC4379p implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f36499n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C2524Ch f36500u;

    public /* synthetic */ RunnableC4379p(C2524Ch c2524Ch, int i) {
        this.f36499n = i;
        this.f36500u = c2524Ch;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f36499n) {
            case 0:
                C2524Ch c2524Ch = this.f36500u;
                c2524Ch.getClass();
                ((B) c2524Ch.f24939w).execute(new RunnableC4379p(c2524Ch, 1));
                break;
            default:
                JSONObject jSONObject = new JSONObject();
                C2524Ch c2524Ch2 = this.f36500u;
                Application application = (Application) c2524Ch2.f24936n;
                try {
                    jSONObject.put("app_name", application.getPackageManager().getApplicationLabel(application.getApplicationInfo()).toString());
                    Drawable applicationIcon = application.getPackageManager().getApplicationIcon(application.getApplicationInfo());
                    String str = null;
                    if (applicationIcon != null && applicationIcon.getIntrinsicWidth() > 0 && applicationIcon.getIntrinsicHeight() > 0) {
                        Bitmap createBitmap = Bitmap.createBitmap(applicationIcon.getIntrinsicWidth(), applicationIcon.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        applicationIcon.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                        applicationIcon.draw(canvas);
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        createBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                        str = "data:image/png;base64,".concat(String.valueOf(Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2)));
                    }
                    jSONObject.put("app_icon", str);
                    JSONObject jSONObject2 = new JSONObject();
                    C4343g c4343g = (C4343g) c2524Ch2.f24935A;
                    for (String str2 : c4343g.a().keySet()) {
                        jSONObject2.put(str2, c4343g.a().get(str2));
                    }
                    jSONObject.put("stored_infos_map", jSONObject2);
                } catch (JSONException unused) {
                }
                ((C4359k) c2524Ch2.f24942z).f36471h.a("UMP_configureFormWithAppAssets", jSONObject.toString());
                break;
        }
    }
}

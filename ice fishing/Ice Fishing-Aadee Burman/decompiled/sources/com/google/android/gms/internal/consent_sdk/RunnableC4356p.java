package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.Base64;
import com.google.android.gms.internal.ads.C2504Ch;
import java.io.ByteArrayOutputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.consent_sdk.p, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC4356p implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f35730n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C2504Ch f35731u;

    public /* synthetic */ RunnableC4356p(C2504Ch c2504Ch, int i) {
        this.f35730n = i;
        this.f35731u = c2504Ch;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f35730n) {
            case 0:
                C2504Ch c2504Ch = this.f35731u;
                c2504Ch.getClass();
                ((B) c2504Ch.f24204w).execute(new RunnableC4356p(c2504Ch, 1));
                break;
            default:
                JSONObject jSONObject = new JSONObject();
                C2504Ch c2504Ch2 = this.f35731u;
                Application application = (Application) c2504Ch2.f24201n;
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
                    C4320g c4320g = (C4320g) c2504Ch2.f24200A;
                    for (String str2 : c4320g.a().keySet()) {
                        jSONObject2.put(str2, c4320g.a().get(str2));
                    }
                    jSONObject.put("stored_infos_map", jSONObject2);
                } catch (JSONException unused) {
                }
                ((C4336k) c2504Ch2.f24207z).f35702h.a("UMP_configureFormWithAppAssets", jSONObject.toString());
                break;
        }
    }
}

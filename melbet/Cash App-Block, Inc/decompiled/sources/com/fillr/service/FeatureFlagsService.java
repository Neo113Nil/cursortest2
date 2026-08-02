package com.fillr.service;

import android.app.IntentService;
import android.content.Intent;
import androidx.media3.extractor.mkv.Sniffer;
import com.caverock.androidsvg.SVG;
import com.fillr.featuretoggle.DefaultUnleash;
import com.fillr.featuretoggle.UnleashException;
import com.fillr.featuretoggle.repository.ToggleCollection;
import com.google.android.gms.auth.api.zbc;
import com.google.mlkit.vision.text.zzd;

/* loaded from: classes4.dex */
public class FeatureFlagsService extends IntentService {
    public FeatureFlagsService() {
        super("Feature toggles");
    }

    @Override // android.app.IntentService
    public final void onHandleIntent(Intent intent) {
        ToggleCollection toggleCollection;
        try {
            zzd.getInstance().getClass();
            DefaultUnleash defaultUnleash = zzd.unleash;
            if (defaultUnleash != null) {
                zbc zbcVar = defaultUnleash.toggleRepository;
                zbcVar.getClass();
                try {
                    Sniffer fetchToggles = ((SVG) zbcVar.zba).fetchToggles();
                    if (fetchToggles.peekLength == 2 && (toggleCollection = (ToggleCollection) fetchToggles.scratch) != null && !toggleCollection.features.isEmpty()) {
                        zbcVar.zbb = toggleCollection;
                        zbcVar.saveTogglesToLocalCopy(this);
                    }
                } catch (UnleashException | Exception unused) {
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

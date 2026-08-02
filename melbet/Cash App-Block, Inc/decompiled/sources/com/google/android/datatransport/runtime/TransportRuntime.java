package com.google.android.datatransport.runtime;

import android.content.Context;
import androidx.appcompat.view.ActionBarPolicy;
import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.caverock.androidsvg.SVG;
import com.fillr.n;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.cct.CCTDestination;
import com.google.android.datatransport.runtime.scheduling.DefaultScheduler;
import com.google.android.datatransport.runtime.time.Clock;
import com.google.android.gms.maps.zzai;
import com.knotapi.knot.webview.KnotView$$ExternalSyntheticLambda1;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
public final class TransportRuntime {
    public static volatile DaggerTransportRuntimeComponent$TransportRuntimeComponentImpl instance;
    public final Clock eventClock;
    public final DefaultScheduler scheduler;
    public final zzai uploader;
    public final Clock uptimeClock;

    public TransportRuntime(Clock clock, Clock clock2, DefaultScheduler defaultScheduler, zzai zzaiVar, n nVar) {
        this.eventClock = clock;
        this.uptimeClock = clock2;
        this.scheduler = defaultScheduler;
        this.uploader = zzaiVar;
        ((Executor) nVar.a).execute(new KnotView$$ExternalSyntheticLambda1(nVar, 1));
    }

    public static TransportRuntime getInstance() {
        DaggerTransportRuntimeComponent$TransportRuntimeComponentImpl daggerTransportRuntimeComponent$TransportRuntimeComponentImpl = instance;
        if (daggerTransportRuntimeComponent$TransportRuntimeComponentImpl != null) {
            return (TransportRuntime) daggerTransportRuntimeComponent$TransportRuntimeComponentImpl.transportRuntimeProvider.get();
        }
        a$$ExternalSyntheticBUOutline0.m$1("Not initialized!");
        return null;
    }

    public static void initialize(Context context) {
        if (instance == null) {
            synchronized (TransportRuntime.class) {
                try {
                    if (instance == null) {
                        ActionBarPolicy actionBarPolicy = new ActionBarPolicy(6);
                        context.getClass();
                        actionBarPolicy.mContext = context;
                        instance = actionBarPolicy.build();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final TransportFactoryImpl newFactory(CCTDestination cCTDestination) {
        Set unmodifiableSet = cCTDestination instanceof CCTDestination ? Collections.unmodifiableSet(CCTDestination.SUPPORTED_ENCODINGS) : Collections.singleton(new Encoding("proto"));
        SVG builder = AutoValue_TransportContext.builder();
        cCTDestination.getClass();
        builder.rootElement = "cct";
        String str = cCTDestination.endPoint;
        String str2 = cCTDestination.apiKey;
        if (str2 == null) {
            str2 = "";
        }
        builder.cssRules = CameraSelector$$ExternalSyntheticOutline0.m("1$", str, "\\", str2).getBytes(Charset.forName("UTF-8"));
        return new TransportFactoryImpl(unmodifiableSet, builder.build(), this);
    }
}

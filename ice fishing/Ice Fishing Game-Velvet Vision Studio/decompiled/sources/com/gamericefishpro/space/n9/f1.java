package com.gamericefishpro.space.n9;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Pair;
import android.util.SparseArray;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class f1 extends z1 {
    public static final Pair S = new Pair("", 0L);
    public String A;
    public boolean B;
    public long C;
    public final d1 D;
    public final c1 E;
    public final com.gamericefishpro.space.h0.z0 F;
    public final com.gamericefishpro.space.tb.s G;
    public final c1 H;
    public final d1 I;
    public final d1 J;
    public boolean K;
    public final c1 L;
    public final c1 M;
    public final d1 N;
    public final com.gamericefishpro.space.h0.z0 O;
    public final com.gamericefishpro.space.h0.z0 P;
    public final d1 Q;
    public final com.gamericefishpro.space.tb.s R;
    public SharedPreferences i;
    public SharedPreferences v;
    public e1 w;
    public final d1 y;
    public final com.gamericefishpro.space.h0.z0 z;

    public f1(r1 r1Var) {
        super(r1Var);
        this.D = new d1(this, "session_timeout", 1800000L);
        this.E = new c1(this, "start_new_session", true);
        this.I = new d1(this, "last_pause_time", 0L);
        this.J = new d1(this, "session_id", 0L);
        this.F = new com.gamericefishpro.space.h0.z0(this, "non_personalized_ads");
        this.G = new com.gamericefishpro.space.tb.s(this, "last_received_uri_timestamps_by_source");
        this.H = new c1(this, "allow_remote_dynamite", false);
        this.y = new d1(this, "first_open_time", 0L);
        com.gamericefishpro.space.v8.c0.d("app_install_time");
        this.z = new com.gamericefishpro.space.h0.z0(this, "app_instance_id");
        this.L = new c1(this, "app_backgrounded", false);
        this.M = new c1(this, "deep_link_retrieval_complete", false);
        this.N = new d1(this, "deep_link_retrieval_attempts", 0L);
        this.O = new com.gamericefishpro.space.h0.z0(this, "firebase_feature_rollouts");
        this.P = new com.gamericefishpro.space.h0.z0(this, "deferred_attribution_cache");
        this.Q = new d1(this, "deferred_attribution_cache_timestamp", 0L);
        this.R = new com.gamericefishpro.space.tb.s(this, "default_event_parameters");
    }

    public final void A(boolean z) {
        r();
        v0 v0Var = ((r1) this.d).y;
        r1.l(v0Var);
        v0Var.G.b(Boolean.valueOf(z), "App measurement setting deferred collection");
        SharedPreferences.Editor editorEdit = v().edit();
        editorEdit.putBoolean("deferred_analytics_collection", z);
        editorEdit.apply();
    }

    public final boolean B(long j) {
        return j - this.D.a() > this.I.a();
    }

    @Override // com.gamericefishpro.space.n9.z1
    public final boolean s() {
        return true;
    }

    public final SharedPreferences v() {
        r();
        t();
        com.gamericefishpro.space.v8.c0.g(this.i);
        return this.i;
    }

    public final SharedPreferences w() {
        r();
        t();
        if (this.v == null) {
            r1 r1Var = (r1) this.d;
            String strValueOf = String.valueOf(r1Var.d.getPackageName());
            v0 v0Var = r1Var.y;
            r1.l(v0Var);
            t0 t0Var = v0Var.G;
            String strConcat = strValueOf.concat("_preferences");
            t0Var.b(strConcat, "Default prefs file");
            this.v = r1Var.d.getSharedPreferences(strConcat, 0);
        }
        return this.v;
    }

    public final SparseArray x() {
        Bundle bundleK = this.G.k();
        int[] intArray = bundleK.getIntArray("uriSources");
        long[] longArray = bundleK.getLongArray("uriTimestamps");
        if (intArray == null || longArray == null) {
            return new SparseArray();
        }
        if (intArray.length != longArray.length) {
            v0 v0Var = ((r1) this.d).y;
            r1.l(v0Var);
            v0Var.y.a("Trigger URI source and timestamp array lengths do not match");
            return new SparseArray();
        }
        SparseArray sparseArray = new SparseArray();
        for (int i = 0; i < intArray.length; i++) {
            sparseArray.put(intArray[i], Long.valueOf(longArray[i]));
        }
        return sparseArray;
    }

    public final e2 y() {
        r();
        return e2.c(v().getInt("consent_source", 100), v().getString("consent_settings", "G1"));
    }

    public final boolean z(x3 x3Var) {
        r();
        String string = v().getString("stored_tcf_param", "");
        String strA = x3Var.a();
        if (strA.equals(string)) {
            return false;
        }
        SharedPreferences.Editor editorEdit = v().edit();
        editorEdit.putString("stored_tcf_param", strA);
        editorEdit.apply();
        return true;
    }
}

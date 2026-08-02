package com.squareup.cash.boost.db;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.collection.ArrayMap;
import app.cash.sqldelight.EnumColumnAdapter;
import com.google.android.gms.signin.SignInOptions;
import com.squareup.cash.db.WireAdapter;
import dev.zacsweers.metro.Provider;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import okio.AsyncTimeout;

/* loaded from: classes.dex */
public final class Reward$Adapter {
    public Object app_linksAdapter;
    public Object avatarsAdapter;
    public Object boost_attributesAdapter;
    public Object boost_detail_bottom_upsellAdapter;
    public Object boost_detail_rowsAdapter;
    public Object program_detail_rowsAdapter;
    public Object reward_selection_stateAdapter;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.Map] */
    public Reward$Adapter(Set set, ArrayMap arrayMap, String str, String str2, SignInOptions signInOptions) {
        Set unmodifiableSet = set == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(set);
        this.avatarsAdapter = unmodifiableSet;
        ArrayMap arrayMap2 = arrayMap == null ? Collections.EMPTY_MAP : arrayMap;
        this.boost_detail_bottom_upsellAdapter = arrayMap2;
        this.app_linksAdapter = str;
        this.program_detail_rowsAdapter = str2;
        this.boost_detail_rowsAdapter = signInOptions == null ? SignInOptions.zaa : signInOptions;
        HashSet hashSet = new HashSet(unmodifiableSet);
        Iterator it = arrayMap2.values().iterator();
        if (it.hasNext()) {
            throw Recorder$$ExternalSyntheticOutline2.m(it);
        }
        this.reward_selection_stateAdapter = Collections.unmodifiableSet(hashSet);
    }

    public /* synthetic */ Reward$Adapter(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7) {
        this.avatarsAdapter = provider;
        this.reward_selection_stateAdapter = provider2;
        this.boost_detail_bottom_upsellAdapter = provider3;
        this.app_linksAdapter = provider4;
        this.program_detail_rowsAdapter = provider5;
        this.boost_detail_rowsAdapter = provider6;
        this.boost_attributesAdapter = provider7;
    }

    public /* synthetic */ Reward$Adapter(EnumColumnAdapter enumColumnAdapter, WireAdapter wireAdapter, WireAdapter wireAdapter2, WireAdapter wireAdapter3, WireAdapter wireAdapter4, Object obj, AsyncTimeout.Companion companion) {
        this.program_detail_rowsAdapter = enumColumnAdapter;
        this.avatarsAdapter = wireAdapter;
        this.reward_selection_stateAdapter = wireAdapter2;
        this.boost_detail_bottom_upsellAdapter = wireAdapter3;
        this.app_linksAdapter = wireAdapter4;
        this.boost_detail_rowsAdapter = obj;
        this.boost_attributesAdapter = companion;
    }
}

package com.squareup.cash.shortcut;

import android.content.Context;
import android.content.pm.ShortcutManager;
import coil3.RealImageLoader;
import com.squareup.cash.data.contacts.RealContactRepository;
import com.squareup.preferences.PreferenceFlow$flow$1;
import com.squareup.util.coroutines.IoSetupTeardown;
import com.squareup.util.coroutines.StateFlowKt;
import com.squareup.util.coroutines.Teardown;
import kotlin.coroutines.Continuation;
import kotlin.reflect.KClass;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.JobKt;

/* loaded from: classes.dex */
public final class RealDynamicShortcutManager implements IoSetupTeardown {
    public final KClass activity;
    public final RealContactRepository contactRepository;
    public final Context context;
    public final RealImageLoader imageLoader;
    public final ShortcutManager shortcutManager;

    public RealDynamicShortcutManager(Context context, RealContactRepository realContactRepository, RealImageLoader realImageLoader, KClass kClass) {
        this.context = context;
        this.contactRepository = realContactRepository;
        this.imageLoader = realImageLoader;
        this.activity = kClass;
        Object systemService = context.getSystemService((Class<Object>) ShortcutManager.class);
        systemService.getClass();
        this.shortcutManager = (ShortcutManager) systemService;
    }

    @Override // com.squareup.util.coroutines.UnitSetupTeardown
    public final Teardown setup(CoroutineScope coroutineScope) {
        coroutineScope.getClass();
        JobKt.launch$default(coroutineScope, null, CoroutineStart.DEFAULT, new PreferenceFlow$flow$1((Continuation) null, this, 4), 1);
        return StateFlowKt.noOpTeardown;
    }
}

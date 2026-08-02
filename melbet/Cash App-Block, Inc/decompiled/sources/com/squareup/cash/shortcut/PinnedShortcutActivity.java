package com.squareup.cash.shortcut;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ShortcutManager;
import android.os.Bundle;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.glance.appwidget.SizeBoxKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.jvm.internal.Intrinsics;
import timber.log.Timber;

/* loaded from: classes7.dex */
public abstract class PinnedShortcutActivity extends Activity {
    public abstract SizeBoxKt createShortcutResult(PinnedShortcutActivity pinnedShortcutActivity, ShortcutManager shortcutManager);

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (!Intrinsics.areEqual(intent != null ? intent.getAction() : null, "android.intent.action.CREATE_SHORTCUT")) {
            Timber.Forest forest = Timber.Forest;
            String simpleName = getClass().getSimpleName();
            Intent intent2 = getIntent();
            forest.e(Recorder$$ExternalSyntheticOutline2.m(simpleName, " launched with unexpected action: ", intent2 != null ? intent2.getAction() : null), new Object[0]);
            setResult(0);
            finish();
            return;
        }
        ShortcutManager shortcutManager = (ShortcutManager) getSystemService(ShortcutManager.class);
        if (shortcutManager == null) {
            Timber.Forest.e("ShortcutManager not available", new Object[0]);
            setResult(0);
            finish();
            return;
        }
        SizeBoxKt createShortcutResult = createShortcutResult(this, shortcutManager);
        if (createShortcutResult instanceof PinnedShortcutResult$Success) {
            setResult(-1, ((PinnedShortcutResult$Success) createShortcutResult).resultIntent);
        } else if (!(createShortcutResult instanceof PinnedShortcutResult$Failure)) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        } else {
            Timber.Forest.e("Failed to create shortcut: Failed to format deep link", new Object[0]);
            setResult(0);
        }
        finish();
    }
}

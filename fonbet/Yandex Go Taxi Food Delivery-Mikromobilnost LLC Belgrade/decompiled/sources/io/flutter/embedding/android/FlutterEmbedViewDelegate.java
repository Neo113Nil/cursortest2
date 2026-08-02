package io.flutter.embedding.android;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLProtectionSpaceContract;
import defpackage.ktr;
import io.appmetrica.analytics.rtm.internal.Constants;
import io.flutter.embedding.engine.FlutterEngine;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J=\u0010\u001c\u001a\u00020\u001b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010\u001f\u001a\u00020\u000f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u000fH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u000fH\u0016¢\u0006\u0004\b#\u0010\"J\u000f\u0010$\u001a\u00020\u000fH\u0016¢\u0006\u0004\b$\u0010\"J\u000f\u0010%\u001a\u00020\u000fH\u0016¢\u0006\u0004\b%\u0010\"J\u000f\u0010&\u001a\u00020\u000fH\u0016¢\u0006\u0004\b&\u0010\"J\u0019\u0010'\u001a\u00020\u000f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b'\u0010 J\u000f\u0010(\u001a\u00020\u000fH\u0016¢\u0006\u0004\b(\u0010\"J\u000f\u0010)\u001a\u00020\u000fH\u0016¢\u0006\u0004\b)\u0010\"J\u000f\u0010*\u001a\u00020\u000fH\u0016¢\u0006\u0004\b*\u0010\"J/\u00101\u001a\u00020\u000f2\u0006\u0010+\u001a\u00020\u00182\u000e\u0010.\u001a\n\u0012\u0006\b\u0001\u0012\u00020-0,2\u0006\u00100\u001a\u00020/H\u0017¢\u0006\u0004\b1\u00102J\u0017\u00105\u001a\u00020\u000f2\u0006\u00104\u001a\u000203H\u0017¢\u0006\u0004\b5\u00106J)\u00109\u001a\u00020\u000f2\u0006\u0010+\u001a\u00020\u00182\u0006\u00107\u001a\u00020\u00182\b\u00108\u001a\u0004\u0018\u000103H\u0017¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u00020\u000fH\u0017¢\u0006\u0004\b;\u0010\"J\u000f\u0010<\u001a\u00020\u000fH\u0017¢\u0006\u0004\b<\u0010\"J\u0017\u0010?\u001a\u00020\u000f2\u0006\u0010>\u001a\u00020=H\u0016¢\u0006\u0004\b?\u0010@J\u000f\u0010A\u001a\u00020\u000fH\u0016¢\u0006\u0004\bA\u0010\"J\u0017\u0010C\u001a\u00020\u000f2\u0006\u0010B\u001a\u00020\u0018H\u0016¢\u0006\u0004\bC\u0010DR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010E¨\u0006F"}, d2 = {"Lio/flutter/embedding/android/FlutterEmbedViewDelegate;", "Lio/flutter/embedding/android/a;", "Landroid/content/ComponentCallbacks2;", "Lktr;", URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST, "<init>", "(Lktr;)V", "", "isAttached", "()Z", "Lio/flutter/embedding/engine/FlutterEngine;", "getFlutterEngine", "()Lio/flutter/embedding/engine/FlutterEngine;", "Landroid/content/Context;", "context", "Lzy11;", "onAttach", "(Landroid/content/Context;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "", "flutterViewId", "shouldDelayFirstAndroidViewDraw", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;IZ)Landroid/view/View;", "bundle", "onRestoreInstanceState", "(Landroid/os/Bundle;)V", "onStart", "()V", "onResume", "onPostResume", "onPause", "onStop", "onSaveInstanceState", "onDestroyView", "onDetach", "release", "requestCode", "", "", "permissions", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "Landroid/content/Intent;", "intent", "onNewIntent", "(Landroid/content/Intent;)V", "resultCode", Constants.KEY_DATA, "onActivityResult", "(IILandroid/content/Intent;)V", "onUserLeaveHint", "onBackPressed", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "onLowMemory", "level", "onTrimMemory", "(I)V", "Lktr;", "drive_sdk_go_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FlutterEmbedViewDelegate extends a implements ComponentCallbacks2 {
    private final ktr host;

    public FlutterEmbedViewDelegate(ktr ktrVar) {
        super(ktrVar);
        this.host = ktrVar;
        ktrVar.C = this;
    }

    @Override // io.flutter.embedding.android.a
    public FlutterEngine getFlutterEngine() {
        return super.getFlutterEngine();
    }

    @Override // io.flutter.embedding.android.a
    public boolean isAttached() {
        return super.isAttached();
    }

    @Override // io.flutter.embedding.android.a
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }

    @Override // io.flutter.embedding.android.a
    public void onAttach(Context context) {
        super.onAttach(context);
        this.host.a.registerComponentCallbacks(this);
    }

    @Override // io.flutter.embedding.android.a
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
    }

    @Override // io.flutter.embedding.android.a
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState, int flutterViewId, boolean shouldDelayFirstAndroidViewDraw) {
        return super.onCreateView(inflater, container, savedInstanceState, flutterViewId, shouldDelayFirstAndroidViewDraw);
    }

    @Override // io.flutter.embedding.android.a
    public void onDestroyView() {
        super.onDestroyView();
    }

    @Override // io.flutter.embedding.android.a
    public void onDetach() {
        super.onDetach();
        this.host.a.unregisterComponentCallbacks(this);
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
    }

    @Override // io.flutter.embedding.android.a
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
    }

    @Override // io.flutter.embedding.android.a
    public void onPause() {
        super.onPause();
    }

    @Override // io.flutter.embedding.android.a
    public void onPostResume() {
        super.onPostResume();
    }

    @Override // io.flutter.embedding.android.a
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
    }

    @Override // io.flutter.embedding.android.a
    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
    }

    @Override // io.flutter.embedding.android.a
    public void onResume() {
        super.onResume();
    }

    @Override // io.flutter.embedding.android.a
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
    }

    @Override // io.flutter.embedding.android.a
    public void onStart() {
        super.onStart();
    }

    @Override // io.flutter.embedding.android.a
    public void onStop() {
        super.onStop();
    }

    @Override // io.flutter.embedding.android.a, android.content.ComponentCallbacks2
    public void onTrimMemory(int level) {
        super.onTrimMemory(level);
    }

    @Override // io.flutter.embedding.android.a
    public void onUserLeaveHint() {
        super.onUserLeaveHint();
    }

    @Override // io.flutter.embedding.android.a
    public void release() {
        super.release();
    }
}

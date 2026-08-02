package ru.yandex.taxi.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.fragment.app.FragmentActivity;
import defpackage.alj;
import defpackage.el40;
import defpackage.fl40;
import defpackage.hst;
import defpackage.i2m0;
import defpackage.jst;
import defpackage.ny61;
import defpackage.o300;
import defpackage.p0d;
import defpackage.p300;
import defpackage.q15;
import defpackage.ti00;
import defpackage.ttd;
import defpackage.ui00;
import defpackage.wwg;
import defpackage.xm00;
import defpackage.xmr0;
import defpackage.zbs;
import defpackage.zyq;
import defpackage.zzf;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;
import ru.yandex.taxi.fragment.MapFragment;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\b\u0012\u0004\u0012\u00020\u00070\u00062\b\u0012\u0004\u0012\u00020\t0\b:\u0002GQB\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0016\u001a\u00020\u000e2\b\u0010\u0015\u001a\u0004\u0018\u00010\fH\u0014¢\u0006\u0004\b\u0016\u0010\u0010J\u000f\u0010\u0017\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0017\u0010\u000bJ\u000f\u0010\u0018\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0018\u0010\u000bJ\u000f\u0010\u0019\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0019\u0010\u000bJ\u000f\u0010\u001a\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u001a\u0010\u000bJ\u000f\u0010\u001b\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u001b\u0010\u000bJ\u0017\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ-\u0010'\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020 2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"2\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(J)\u0010+\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020 2\u0006\u0010)\u001a\u00020 2\b\u0010*\u001a\u0004\u0018\u00010\u001cH\u0014¢\u0006\u0004\b+\u0010,J\u0017\u00100\u001a\u00020/2\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b0\u00101J\u0017\u00104\u001a\u00020/2\u0006\u00103\u001a\u000202H\u0017¢\u0006\u0004\b4\u00105J\u0019\u00106\u001a\u00020/2\b\u00103\u001a\u0004\u0018\u00010-H\u0016¢\u0006\u0004\b6\u00101J\u000f\u00107\u001a\u00020\u000eH\u0016¢\u0006\u0004\b7\u0010\u000bJ\u0017\u00108\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b8\u0010\u001fJ\u000f\u0010:\u001a\u000209H\u0016¢\u0006\u0004\b:\u0010;J\u0011\u0010=\u001a\u0004\u0018\u00010<H\u0016¢\u0006\u0004\b=\u0010>J\u000f\u0010?\u001a\u00020\u0007H\u0016¢\u0006\u0004\b?\u0010@J'\u0010E\u001a\u00020\t2\u000e\u0010B\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030A2\u0006\u0010D\u001a\u00020CH\u0016¢\u0006\u0004\bE\u0010FR\u0018\u0010H\u001a\u0004\u0018\u00010G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010L\u001a\u00020G8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010KR\u0016\u0010P\u001a\u0004\u0018\u00010M8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bN\u0010O¨\u0006R"}, d2 = {"Lru/yandex/taxi/activity/MainActivity;", "Landroidx/fragment/app/FragmentActivity;", "Lalj;", "Lfl40;", "Lzyq;", "Lxmr0;", "Lq15;", "Lzbs;", "Lui00;", "Lti00;", "<init>", "()V", "Landroid/os/Bundle;", "outState", "Lzy11;", "onSaveInstanceState", "(Landroid/os/Bundle;)V", "Landroid/content/Context;", "newBase", "attachBaseContext", "(Landroid/content/Context;)V", "savedInstanceState", "onCreate", "onStart", "onResume", "onPause", "onStop", "onDestroy", "Landroid/content/Intent;", "intent", "onNewIntent", "(Landroid/content/Intent;)V", "", "requestCode", "", "", "permissions", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "resultCode", Constants.KEY_DATA, "onActivityResult", "(IILandroid/content/Intent;)V", "Landroid/view/MotionEvent;", "ev", "", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "Landroid/view/KeyEvent;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "dispatchKeyEvent", "(Landroid/view/KeyEvent;)Z", "onTouchEvent", "finish", "handleNewIntent", "Lel40;", "sharedMultiClickHandler", "()Lel40;", "Lru/yandex/taxi/fragment/common/b;", "createDefaultFileChooserHandler", "()Lru/yandex/taxi/fragment/common/b;", "createFragmentComponent", "()Lzbs;", "Lru/yandex/taxi/fragment/MapFragment;", "fragment", "Lxm00;", "associatedLayer", "createMapFragmentComponent", "(Lru/yandex/taxi/fragment/MapFragment;Lxm00;)Lti00;", "Lo300;", "_delegate", "Lo300;", "getDelegate", "()Lo300;", "delegate", "Lttd;", "getSharedComposeContext", "()Lttd;", "sharedComposeContext", "p300", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class MainActivity extends FragmentActivity implements alj, fl40, zyq, xmr0, q15, ui00 {
    private o300 _delegate;

    public MainActivity() {
        addOnContextAvailableListener(new p0d(this, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(MainActivity mainActivity, Context context) {
        i2m0 i2m0Var = mainActivity.getSavedStateRegistry().a;
        synchronized (i2m0Var.c) {
        }
    }

    private final o300 getDelegate() {
        o300 o300Var = this._delegate;
        if (o300Var != null) {
            return o300Var;
        }
        ny61.r("Can't access to MainActivity.Delegate before attachBaseContext");
        return null;
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context newBase) {
        zzf zzfVar = (zzf) ((p300) wwg.e(newBase, p300.class));
        this._delegate = zzfVar.w().a() ? (o300) zzfVar.wi.get() : (o300) zzfVar.vi.get();
        super.attachBaseContext(getDelegate().j(newBase));
        getDelegate().a(this);
    }

    @Override // defpackage.zyq
    public ru.yandex.taxi.fragment.common.b createDefaultFileChooserHandler() {
        return getDelegate().createDefaultFileChooserHandler();
    }

    @Override // defpackage.q15
    public zbs createFragmentComponent() {
        return getDelegate().createFragmentComponent();
    }

    @Override // defpackage.ui00
    public ti00 createMapFragmentComponent(MapFragment<?, ?> fragment, xm00 associatedLayer) {
        return getDelegate().createMapFragmentComponent(fragment, associatedLayer);
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent event) {
        return getDelegate().dispatchKeyEvent(event) && super.dispatchKeyEvent(event);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent ev) {
        return getDelegate().dispatchTouchEvent(ev) && super.dispatchTouchEvent(ev);
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        hst hstVar = jst.e;
        new Throwable();
        hstVar.getClass();
    }

    @Override // defpackage.xmr0
    public ttd getSharedComposeContext() {
        o300 o300Var = this._delegate;
        if (o300Var != null) {
            return o300Var.getSharedComposeContext();
        }
        return null;
    }

    @Override // defpackage.alj
    public void handleNewIntent(Intent intent) {
        getDelegate().handleNewIntent(intent);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        getDelegate().i(this, requestCode, resultCode, data);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        getDelegate().e(this);
        super.onCreate(savedInstanceState);
        getDelegate().f(this, elapsedRealtime, savedInstanceState);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        SystemClock.elapsedRealtime();
        super.onDestroy();
        getDelegate().d();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        getDelegate().handleNewIntent(intent);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        SystemClock.elapsedRealtime();
        super.onPause();
        getDelegate().c();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        getDelegate().onRequestPermissionsResult(requestCode, permissions, grantResults);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        super.onResume();
        getDelegate().k(elapsedRealtime);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.remove("android:support:fragments");
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        super.onStart();
        getDelegate().h(elapsedRealtime);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        SystemClock.elapsedRealtime();
        super.onStop();
        getDelegate().b();
    }

    @Override // android.app.Activity
    public boolean onTouchEvent(MotionEvent event) {
        getDelegate().g(event);
        return super.onTouchEvent(event);
    }

    @Override // defpackage.fl40
    public el40 sharedMultiClickHandler() {
        return getDelegate().sharedMultiClickHandler();
    }
}

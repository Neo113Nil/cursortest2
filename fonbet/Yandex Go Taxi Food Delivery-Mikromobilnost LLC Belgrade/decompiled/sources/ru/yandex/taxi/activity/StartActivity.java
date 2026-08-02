package ru.yandex.taxi.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import androidx.fragment.app.FragmentActivity;
import defpackage.h6r;
import defpackage.ms2;
import defpackage.os2;
import defpackage.wwg;
import defpackage.y72;
import defpackage.zzf;
import kotlin.Metadata;
import ru.yandex.taxi.perf.Milestone;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/yandex/taxi/activity/StartActivity;", "Landroidx/fragment/app/FragmentActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Lzy11;", "onCreate", "(Landroid/os/Bundle;)V", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class StartActivity extends FragmentActivity {
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        super.onCreate(savedInstanceState);
        zzf zzfVar = (zzf) ((h6r) wwg.e(this, h6r.class));
        ms2 ms2Var = (ms2) zzfVar.a2.get();
        Milestone milestone = Milestone.StartActivity;
        os2 os2Var = (os2) ms2Var;
        os2Var.d(milestone, elapsedRealtime);
        Intent intent = getIntent();
        if (intent != null) {
            intent.setClass(this, ((y72) zzfVar.R.get()).a(AndroidComponentRepository$Component.MAIN_ACTIVITY));
            startActivity(intent);
        }
        finish();
        overridePendingTransition(0, 0);
        os2Var.a(milestone);
    }
}

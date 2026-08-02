package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ConfigurationInfo;
import androidx.fragment.app.t;
import com.yandex.music.shared.wave.shader.api.component.WaveGlShaderView;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ru.yandex.music.search.SearchActivity;

/* loaded from: classes3.dex */
public final /* synthetic */ class j1e implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ s2e b;

    public /* synthetic */ j1e(s2e s2eVar, int i) {
        this.a = i;
        this.b = s2eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        boolean z;
        n5v n5vVar;
        switch (this.a) {
            case 0:
                s2e s2eVar = this.b;
                WaveGlShaderView waveGlShaderView = (WaveGlShaderView) s2eVar.j.a(s2e.G[7]);
                byte b = 0;
                waveGlShaderView.setVisibility(0);
                int i = s2eVar.t;
                p2e p2eVar = new p2e(s2eVar);
                int i2 = WaveGlShaderView.m;
                Context context = waveGlShaderView.getRootView().getContext();
                context.getClass();
                Boolean bool = u1g.a;
                int i3 = 1;
                if (bool != null) {
                    z = bool.booleanValue();
                } else {
                    ActivityManager b2 = l1b.b(context);
                    if (b2 == null) {
                        z = false;
                    } else {
                        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                        b2.getMemoryInfo(memoryInfo);
                        ConfigurationInfo deviceConfigurationInfo = b2.getDeviceConfigurationInfo();
                        deviceConfigurationInfo.getClass();
                        z = !b2.isLowRamDevice() && memoryInfo.totalMem > 1073741824 && deviceConfigurationInfo.reqGlEsVersion >= 196608;
                        u1g.a = Boolean.valueOf(z);
                    }
                }
                if (z) {
                    Context context2 = waveGlShaderView.getRootView().getContext();
                    context2.getClass();
                    jsu jsuVar = new jsu(context2, i, false, 1300L);
                    waveGlShaderView.i.setValue(new wn5(new isu(jsuVar, i3, b), -167896119, true));
                    n5vVar = jsuVar;
                } else {
                    y60 e = dhn.b.e();
                    arf g = tlm.g(bwf.c);
                    ((Map) g.getValue()).put("gen2", Boolean.TRUE);
                    e.a(new y70("RadioSmartBlock_ShaderAnimation_NotSupported", g.isInitialized() ? (Map) g.getValue() : null));
                    n5v n5vVar2 = new n5v(p2eVar);
                    waveGlShaderView.i.setValue(new wn5(new ksu(n5vVar2), -813696067, true));
                    n5vVar = n5vVar2;
                }
                waveGlShaderView.j = n5vVar;
                waveGlShaderView.k = true;
                if (waveGlShaderView.isAttachedToWindow()) {
                    waveGlShaderView.l();
                }
                return waveGlShaderView;
            default:
                h4b h4bVar = this.b.x;
                if (h4bVar != null) {
                    x1e x1eVar = ((u1e) h4bVar.a).a;
                    t requireActivity = x1eVar.a.requireActivity();
                    np2 np2Var = requireActivity instanceof np2 ? (np2) requireActivity : null;
                    rf3 J = np2Var != null ? np2Var.l().J() : null;
                    Context context3 = x1eVar.c;
                    int i4 = SearchActivity.Z;
                    context3.startActivity(rvf.E(context3, rvf.x(J)));
                }
                return Unit.a;
        }
    }
}

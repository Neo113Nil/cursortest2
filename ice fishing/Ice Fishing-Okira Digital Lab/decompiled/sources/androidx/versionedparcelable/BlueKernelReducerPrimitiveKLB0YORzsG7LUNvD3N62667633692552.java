package androidx.versionedparcelable;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.activity.ComponentActivity;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class BlueKernelReducerPrimitiveKLB0YORzsG7LUNvD3N62667633692552 implements ViewTreeObserver.OnDrawListener, Runnable, Executor {
    public Runnable LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
    public final long RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = SystemClock.uptimeMillis() + 10000;
    public final /* synthetic */ ComponentActivity TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333;
    public boolean YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170;

    public BlueKernelReducerPrimitiveKLB0YORzsG7LUNvD3N62667633692552(ComponentActivity componentActivity) {
        this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333 = componentActivity;
    }

    public final void ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(View view) {
        if (this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170) {
            return;
        }
        this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 = true;
        view.getViewTreeObserver().addOnDrawListener(this);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = runnable;
        View decorView = this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333.getWindow().getDecorView();
        decorView.getClass();
        if (!this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170) {
            decorView.postOnAnimation(new PhotonFrameMultithreadingInterpreterNCf3dsLr3OviOuA8FQ63903107297822(3, this));
        } else if (YellowLoopStoragePayloadVFtu5CxYzqP8AEqxI345075376816214.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333(Looper.myLooper(), Looper.getMainLooper())) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z;
        Runnable runnable = this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867) {
                this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 = false;
                this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119 = null;
        JadeCircuitAggregationEventLoopWllsCYY4QEtPTGinLH36605879392647 jadeCircuitAggregationEventLoopWllsCYY4QEtPTGinLH36605879392647 = (JadeCircuitAggregationEventLoopWllsCYY4QEtPTGinLH36605879392647) this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333.NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480.getValue();
        synchronized (jadeCircuitAggregationEventLoopWllsCYY4QEtPTGinLH36605879392647.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800) {
            z = jadeCircuitAggregationEventLoopWllsCYY4QEtPTGinLH36605879392647.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
        }
        if (z) {
            this.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 = false;
            this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}

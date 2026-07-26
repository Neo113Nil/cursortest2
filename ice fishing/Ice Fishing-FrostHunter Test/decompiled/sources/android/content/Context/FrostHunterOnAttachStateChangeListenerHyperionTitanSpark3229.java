package android.content.Context;

import android.content.Context;
import android.view.ViewGroup;
import com.frosthunter.arcticwildlands.frozenexpedition.adventure.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterOnAttachStateChangeListenerHyperionTitanSpark3229 extends ViewGroup {
    public final ArrayList FrostHunterAlertDialogAuroraDelta3200;
    public final int FrostHunterCameraXPixelTurboCosmos9814;
    public final ArrayList FrostHunterFlowMaxDragonHero5809;
    public int FrostHunterFragmentBetaMegaVortex6025;
    public final FrostHunterKotlinQuantumRogue5892 FrostHunterKeyframeGammaGamma1197;

    public FrostHunterOnAttachStateChangeListenerHyperionTitanSpark3229(Context context) {
        super(context);
        this.FrostHunterCameraXPixelTurboCosmos9814 = 5;
        ArrayList arrayList = new ArrayList();
        this.FrostHunterFlowMaxDragonHero5809 = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.FrostHunterAlertDialogAuroraDelta3200 = arrayList2;
        this.FrostHunterKeyframeGammaGamma1197 = new FrostHunterKotlinQuantumRogue5892(20);
        setClipChildren(false);
        FrostHunterAnimationSetMasterStrikeBlaze6870 frostHunterAnimationSetMasterStrikeBlaze6870 = new FrostHunterAnimationSetMasterStrikeBlaze6870(context);
        addView(frostHunterAnimationSetMasterStrikeBlaze6870);
        arrayList.add(frostHunterAnimationSetMasterStrikeBlaze6870);
        arrayList2.add(frostHunterAnimationSetMasterStrikeBlaze6870);
        this.FrostHunterFragmentBetaMegaVortex6025 = 1;
        setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
    }

    public final FrostHunterAnimationSetMasterStrikeBlaze6870 FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterAlarmManagerTitanEpic1660 frostHunterAlarmManagerTitanEpic1660) {
        FrostHunterKotlinQuantumRogue5892 frostHunterKotlinQuantumRogue5892 = this.FrostHunterKeyframeGammaGamma1197;
        LinkedHashMap linkedHashMap = (LinkedHashMap) frostHunterKotlinQuantumRogue5892.FrostHunterAlertDialogAuroraDelta3200;
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) frostHunterKotlinQuantumRogue5892.FrostHunterAlertDialogAuroraDelta3200;
        LinkedHashMap linkedHashMap3 = (LinkedHashMap) frostHunterKotlinQuantumRogue5892.FrostHunterFlowMaxDragonHero5809;
        FrostHunterAnimationSetMasterStrikeBlaze6870 frostHunterAnimationSetMasterStrikeBlaze6870 = (FrostHunterAnimationSetMasterStrikeBlaze6870) linkedHashMap.get(frostHunterAlarmManagerTitanEpic1660);
        if (frostHunterAnimationSetMasterStrikeBlaze6870 != null) {
            return frostHunterAnimationSetMasterStrikeBlaze6870;
        }
        ArrayList arrayList = this.FrostHunterAlertDialogAuroraDelta3200;
        arrayList.getClass();
        FrostHunterAnimationSetMasterStrikeBlaze6870 frostHunterAnimationSetMasterStrikeBlaze68702 = (FrostHunterAnimationSetMasterStrikeBlaze6870) (arrayList.isEmpty() ? null : arrayList.remove(0));
        if (frostHunterAnimationSetMasterStrikeBlaze68702 == null) {
            int i = this.FrostHunterFragmentBetaMegaVortex6025;
            ArrayList arrayList2 = this.FrostHunterFlowMaxDragonHero5809;
            if (i > FrostHunterCardViewHyperionAurora3829.FrostHunterDatabaseEliteShadowUltra2452(arrayList2)) {
                frostHunterAnimationSetMasterStrikeBlaze68702 = new FrostHunterAnimationSetMasterStrikeBlaze6870(getContext());
                addView(frostHunterAnimationSetMasterStrikeBlaze68702);
                arrayList2.add(frostHunterAnimationSetMasterStrikeBlaze68702);
            } else {
                frostHunterAnimationSetMasterStrikeBlaze68702 = (FrostHunterAnimationSetMasterStrikeBlaze6870) arrayList2.get(this.FrostHunterFragmentBetaMegaVortex6025);
                FrostHunterAlarmManagerTitanEpic1660 frostHunterAlarmManagerTitanEpic16602 = (FrostHunterAlarmManagerTitanEpic1660) linkedHashMap3.get(frostHunterAnimationSetMasterStrikeBlaze68702);
                if (frostHunterAlarmManagerTitanEpic16602 != null) {
                    frostHunterAlarmManagerTitanEpic16602.FrostHunterRunnableCosmosCelestial4235();
                    FrostHunterAnimationSetMasterStrikeBlaze6870 frostHunterAnimationSetMasterStrikeBlaze68703 = (FrostHunterAnimationSetMasterStrikeBlaze6870) linkedHashMap2.get(frostHunterAlarmManagerTitanEpic16602);
                    if (frostHunterAnimationSetMasterStrikeBlaze68703 != null) {
                    }
                    linkedHashMap2.remove(frostHunterAlarmManagerTitanEpic16602);
                    frostHunterAnimationSetMasterStrikeBlaze68702.FrostHunterBundlePulseFusionHero2475();
                }
            }
            int i2 = this.FrostHunterFragmentBetaMegaVortex6025;
            if (i2 < this.FrostHunterCameraXPixelTurboCosmos9814 - 1) {
                this.FrostHunterFragmentBetaMegaVortex6025 = i2 + 1;
            } else {
                this.FrostHunterFragmentBetaMegaVortex6025 = 0;
            }
        }
        linkedHashMap2.put(frostHunterAlarmManagerTitanEpic1660, frostHunterAnimationSetMasterStrikeBlaze68702);
        linkedHashMap3.put(frostHunterAnimationSetMasterStrikeBlaze68702, frostHunterAlarmManagerTitanEpic1660);
        return frostHunterAnimationSetMasterStrikeBlaze68702;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}

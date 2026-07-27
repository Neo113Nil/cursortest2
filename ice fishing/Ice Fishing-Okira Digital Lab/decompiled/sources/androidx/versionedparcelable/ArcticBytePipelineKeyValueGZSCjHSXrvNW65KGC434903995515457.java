package androidx.versionedparcelable;

import android.R;
import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.app.RemoteAction;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.textclassifier.TextClassification;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class ArcticBytePipelineKeyValueGZSCjHSXrvNW65KGC434903995515457 {
    public final QuantumStreamInjectionControllerSnn73TUZPZYLqo2G8H22718365135162 ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495;
    public final QuantumStreamInjectionControllerSnn73TUZPZYLqo2G8H22718365135162 AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
    public final BlazePulseCompilerDebuggerGkOqSuYvrPzP0JiFW071951148376219 ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
    public final View RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;

    public ArcticBytePipelineKeyValueGZSCjHSXrvNW65KGC434903995515457(BlazePulseCompilerDebuggerGkOqSuYvrPzP0JiFW071951148376219 blazePulseCompilerDebuggerGkOqSuYvrPzP0JiFW071951148376219, QuantumStreamInjectionControllerSnn73TUZPZYLqo2G8H22718365135162 quantumStreamInjectionControllerSnn73TUZPZYLqo2G8H22718365135162, QuantumStreamInjectionControllerSnn73TUZPZYLqo2G8H22718365135162 quantumStreamInjectionControllerSnn73TUZPZYLqo2G8H227183651351622, View view) {
        this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = blazePulseCompilerDebuggerGkOqSuYvrPzP0JiFW071951148376219;
        this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 = quantumStreamInjectionControllerSnn73TUZPZYLqo2G8H22718365135162;
        this.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 = quantumStreamInjectionControllerSnn73TUZPZYLqo2G8H227183651351622;
        this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = view;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00aa, code lost:
    
        if (r7 != false) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(Menu menu) {
        int i;
        List actions;
        CharSequence title;
        Icon icon;
        boolean shouldShowIcon;
        CharSequence label;
        Drawable icon2;
        HeliosRuntimeAbstractionOverloadingQ2L3e4i4RXo1iMSekg81740944577805 heliosRuntimeAbstractionOverloadingQ2L3e4i4RXo1iMSekg81740944577805 = (HeliosRuntimeAbstractionOverloadingQ2L3e4i4RXo1iMSekg81740944577805) this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800();
        final int i2 = 0;
        if (YellowLoopStoragePayloadVFtu5CxYzqP8AEqxI345075376816214.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333(heliosRuntimeAbstractionOverloadingQ2L3e4i4RXo1iMSekg81740944577805, null)) {
            return false;
        }
        menu.clear();
        List list = heliosRuntimeAbstractionOverloadingQ2L3e4i4RXo1iMSekg81740944577805.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
        int size = list.size();
        final int i3 = 1;
        int i4 = 0;
        int i5 = 1;
        int i6 = 1;
        while (i4 < size) {
            BlazePulseVirtualizationPostfixCT20gRpZvuxC2vbmvA93522005541329 blazePulseVirtualizationPostfixCT20gRpZvuxC2vbmvA93522005541329 = (BlazePulseVirtualizationPostfixCT20gRpZvuxC2vbmvA93522005541329) list.get(i4);
            if (blazePulseVirtualizationPostfixCT20gRpZvuxC2vbmvA93522005541329 instanceof BlazePulseOperatorTokenGeHFaRdWPQoEPcbNvu74088525019004) {
                i = i5 + 1;
                final BlazePulseOperatorTokenGeHFaRdWPQoEPcbNvu74088525019004 blazePulseOperatorTokenGeHFaRdWPQoEPcbNvu74088525019004 = (BlazePulseOperatorTokenGeHFaRdWPQoEPcbNvu74088525019004) blazePulseVirtualizationPostfixCT20gRpZvuxC2vbmvA93522005541329;
                MenuItem add = menu.add(i6, i5, i5, blazePulseOperatorTokenGeHFaRdWPQoEPcbNvu74088525019004.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365);
                add.setShowAsAction(2);
                add.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: androidx.versionedparcelable.WhiteFieldFloatingPointAttributeSSOtYIbFBLjO5RQT7d40117416149223
                    @Override // android.view.MenuItem.OnMenuItemClickListener
                    public final boolean onMenuItemClick(MenuItem menuItem) {
                        String text;
                        Intent intent;
                        ActivityOptions pendingIntentBackgroundActivityStartMode;
                        int i7 = i2;
                        Object obj = this;
                        Object obj2 = blazePulseOperatorTokenGeHFaRdWPQoEPcbNvu74088525019004;
                        switch (i7) {
                            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                ((BlazePulseOperatorTokenGeHFaRdWPQoEPcbNvu74088525019004) obj2).RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867.UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339(((ArcticBytePipelineKeyValueGZSCjHSXrvNW65KGC434903995515457) obj).ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800);
                                break;
                            default:
                                Context context = (Context) obj2;
                                TextClassification textClassification = (TextClassification) obj;
                                text = textClassification.getText();
                                int hashCode = text != null ? text.hashCode() : 0;
                                intent = textClassification.getIntent();
                                PendingIntent activity = PendingIntent.getActivity(context, hashCode, intent, 201326592);
                                if (Build.VERSION.SDK_INT < 34) {
                                    activity.send();
                                    break;
                                } else {
                                    try {
                                        pendingIntentBackgroundActivityStartMode = ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1);
                                        activity.send(pendingIntentBackgroundActivityStartMode.toBundle());
                                        break;
                                    } catch (PendingIntent.CanceledException e) {
                                        Objects.toString(activity);
                                        e.toString();
                                        break;
                                    }
                                }
                        }
                        return true;
                    }
                });
            } else {
                if (blazePulseVirtualizationPostfixCT20gRpZvuxC2vbmvA93522005541329 instanceof MysticCacheInheritanceRequestSPDPPl1q31OH1tnIh013012630219290) {
                    if (Build.VERSION.SDK_INT >= 28) {
                        i = i5 + 1;
                        final Context context = this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867.getContext();
                        MysticCacheInheritanceRequestSPDPPl1q31OH1tnIh013012630219290 mysticCacheInheritanceRequestSPDPPl1q31OH1tnIh013012630219290 = (MysticCacheInheritanceRequestSPDPPl1q31OH1tnIh013012630219290) blazePulseVirtualizationPostfixCT20gRpZvuxC2vbmvA93522005541329;
                        final TextClassification textClassification = mysticCacheInheritanceRequestSPDPPl1q31OH1tnIh013012630219290.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
                        int i7 = mysticCacheInheritanceRequestSPDPPl1q31OH1tnIh013012630219290.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495;
                        if (i7 < 0) {
                            label = textClassification.getLabel();
                            MenuItem add2 = menu.add(R.id.textAssist, R.id.textAssist, i5, label);
                            add2.setShowAsAction(2);
                            icon2 = textClassification.getIcon();
                            add2.setIcon(icon2);
                            add2.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: androidx.versionedparcelable.WhiteFieldFloatingPointAttributeSSOtYIbFBLjO5RQT7d40117416149223
                                @Override // android.view.MenuItem.OnMenuItemClickListener
                                public final boolean onMenuItemClick(MenuItem menuItem) {
                                    String text;
                                    Intent intent;
                                    ActivityOptions pendingIntentBackgroundActivityStartMode;
                                    int i72 = i3;
                                    Object obj = textClassification;
                                    Object obj2 = context;
                                    switch (i72) {
                                        case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                            ((BlazePulseOperatorTokenGeHFaRdWPQoEPcbNvu74088525019004) obj2).RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867.UltraBufferProtocolShimPREYZ8knP0yoZyOmOf89330452059339(((ArcticBytePipelineKeyValueGZSCjHSXrvNW65KGC434903995515457) obj).ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800);
                                            break;
                                        default:
                                            Context context2 = (Context) obj2;
                                            TextClassification textClassification2 = (TextClassification) obj;
                                            text = textClassification2.getText();
                                            int hashCode = text != null ? text.hashCode() : 0;
                                            intent = textClassification2.getIntent();
                                            PendingIntent activity = PendingIntent.getActivity(context2, hashCode, intent, 201326592);
                                            if (Build.VERSION.SDK_INT < 34) {
                                                activity.send();
                                                break;
                                            } else {
                                                try {
                                                    pendingIntentBackgroundActivityStartMode = ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1);
                                                    activity.send(pendingIntentBackgroundActivityStartMode.toBundle());
                                                    break;
                                                } catch (PendingIntent.CanceledException e) {
                                                    Objects.toString(activity);
                                                    e.toString();
                                                    break;
                                                }
                                            }
                                    }
                                    return true;
                                }
                            });
                        } else {
                            int i8 = i7 == 0 ? 1 : i2;
                            actions = textClassification.getActions();
                            final RemoteAction RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = JadeCircuitProtocolWorkerIUMOiZT57UnpgBxmQ433928592380118.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867(actions.get(i7));
                            int i9 = i8 != 0 ? 16908353 : i2;
                            title = RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867.getTitle();
                            MenuItem add3 = menu.add(R.id.textAssist, i9, i5, title);
                            add3.setShowAsAction(i8 == 0 ? 0 : 2);
                            if (i8 == 0) {
                                shouldShowIcon = RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867.shouldShowIcon();
                            }
                            icon = RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867.getIcon();
                            add3.setIcon(icon.loadDrawable(context));
                            add3.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: androidx.versionedparcelable.DeltaSignalCoroutineRequestESZgJPV8pXaM4v1pXM65967741943768
                                @Override // android.view.MenuItem.OnMenuItemClickListener
                                public final boolean onMenuItemClick(MenuItem menuItem) {
                                    PendingIntent actionIntent;
                                    ActivityOptions pendingIntentBackgroundActivityStartMode;
                                    actionIntent = RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867.getActionIntent();
                                    if (Build.VERSION.SDK_INT < 34) {
                                        actionIntent.send();
                                        return true;
                                    }
                                    try {
                                        pendingIntentBackgroundActivityStartMode = ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1);
                                        actionIntent.send(pendingIntentBackgroundActivityStartMode.toBundle());
                                    } catch (PendingIntent.CanceledException e) {
                                        Objects.toString(actionIntent);
                                        e.toString();
                                    }
                                    return true;
                                }
                            });
                        }
                    }
                } else if (blazePulseVirtualizationPostfixCT20gRpZvuxC2vbmvA93522005541329 instanceof FrostBridgeGenericBootstrapKcIV0neZspW8lDLcIO39472625344649) {
                    i6++;
                }
                i4++;
                i2 = 0;
            }
            i5 = i;
            i4++;
            i2 = 0;
        }
        return true;
    }
}

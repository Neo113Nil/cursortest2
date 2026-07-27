package androidx.versionedparcelable;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.util.Log;
import java.util.Objects;
import java.util.regex.Matcher;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class DeltaSignalTemplatingServiceNzz2nl82SsV0G2Xqtg51836956192767 extends ZenithPathBinaryInterfaceJPvSokakdHX9LAzKqB54416701949648 {
    public final /* synthetic */ KryptonFlowHeuristicCryptographyOXV35UNOGu9J5JoELg75358857275868 ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeltaSignalTemplatingServiceNzz2nl82SsV0G2Xqtg51836956192767(KryptonFlowHeuristicCryptographyOXV35UNOGu9J5JoELg75358857275868 kryptonFlowHeuristicCryptographyOXV35UNOGu9J5JoELg75358857275868, Looper looper) {
        super(looper);
        this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = kryptonFlowHeuristicCryptographyOXV35UNOGu9J5JoELg75358857275868;
        Looper.getMainLooper();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        KryptonFlowHeuristicCryptographyOXV35UNOGu9J5JoELg75358857275868 kryptonFlowHeuristicCryptographyOXV35UNOGu9J5JoELg75358857275868 = this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                intent.setExtrasClassLoader(new HeliosRuntimeBinaryTreeSubroutineU3Jpyvz33Y5Giprwk335759462303397());
                if (intent.hasExtra("google.messenger")) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof FrostBridgeCryptographyDependencyVVn97wRPScg88HCG8H82290394467291) {
                        kryptonFlowHeuristicCryptographyOXV35UNOGu9J5JoELg75358857275868.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333 = (FrostBridgeCryptographyDependencyVVn97wRPScg88HCG8H82290394467291) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        kryptonFlowHeuristicCryptographyOXV35UNOGu9J5JoELg75358857275868.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170 = (Messenger) parcelableExtra;
                    }
                }
                Intent intent2 = (Intent) message.obj;
                String action = intent2.getAction();
                if (!Objects.equals(action, "com.google.android.c2dm.intent.REGISTRATION")) {
                    if (Log.isLoggable("Rpc", 3)) {
                        "Unexpected response action: ".concat(String.valueOf(action));
                        return;
                    }
                    return;
                }
                String stringExtra = intent2.getStringExtra("registration_id");
                if (stringExtra == null) {
                    stringExtra = intent2.getStringExtra("unregistered");
                }
                if (stringExtra != null) {
                    Matcher matcher = KryptonFlowHeuristicCryptographyOXV35UNOGu9J5JoELg75358857275868.NovaLayerAlgorithmBinaryTreeGxb6K7UbuUZYJfSwmB11271590397480.matcher(stringExtra);
                    if (!matcher.matches()) {
                        if (Log.isLoggable("Rpc", 3)) {
                            "Unexpected response string: ".concat(stringExtra);
                            return;
                        }
                        return;
                    }
                    String group = matcher.group(1);
                    String group2 = matcher.group(2);
                    if (group != null) {
                        Bundle extras = intent2.getExtras();
                        extras.putString("registration_id", group2);
                        kryptonFlowHeuristicCryptographyOXV35UNOGu9J5JoELg75358857275868.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(group, extras);
                        return;
                    }
                    return;
                }
                String stringExtra2 = intent2.getStringExtra("error");
                if (stringExtra2 == null) {
                    "Unexpected response, no error or registration id ".concat(String.valueOf(intent2.getExtras()));
                    return;
                }
                if (Log.isLoggable("Rpc", 3)) {
                    "Received InstanceID error ".concat(stringExtra2);
                }
                if (!stringExtra2.startsWith("|")) {
                    synchronized (kryptonFlowHeuristicCryptographyOXV35UNOGu9J5JoELg75358857275868.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800) {
                        int i = 0;
                        while (true) {
                            try {
                                IronMatrixCoordinatorPipelineRPxH5PD90UR2UPnZGC55377000247868 ironMatrixCoordinatorPipelineRPxH5PD90UR2UPnZGC55377000247868 = kryptonFlowHeuristicCryptographyOXV35UNOGu9J5JoELg75358857275868.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
                                if (i < ironMatrixCoordinatorPipelineRPxH5PD90UR2UPnZGC55377000247868.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170) {
                                    kryptonFlowHeuristicCryptographyOXV35UNOGu9J5JoELg75358857275868.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365((String) ironMatrixCoordinatorPipelineRPxH5PD90UR2UPnZGC55377000247868.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119(i), intent2.getExtras());
                                    i++;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    return;
                }
                String[] split = stringExtra2.split("\\|");
                if (split.length <= 2 || !Objects.equals(split[1], "ID")) {
                    "Unexpected structured response ".concat(stringExtra2);
                    return;
                }
                String str = split[2];
                String str2 = split[3];
                if (str2.startsWith(":")) {
                    str2 = str2.substring(1);
                }
                kryptonFlowHeuristicCryptographyOXV35UNOGu9J5JoELg75358857275868.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(str, intent2.putExtra("error", str2).getExtras());
            }
        }
    }
}

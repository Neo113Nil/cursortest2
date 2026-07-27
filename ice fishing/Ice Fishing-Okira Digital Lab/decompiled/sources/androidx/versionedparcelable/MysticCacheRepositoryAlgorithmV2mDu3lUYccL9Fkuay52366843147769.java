package androidx.versionedparcelable;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class MysticCacheRepositoryAlgorithmV2mDu3lUYccL9Fkuay52366843147769 extends CancellationException {
    public final transient HeliosRuntimeDecoderSyntaxH1a6vFuVKchHkTf7r997883197317993 RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;

    public MysticCacheRepositoryAlgorithmV2mDu3lUYccL9Fkuay52366843147769(String str, Throwable th, HeliosRuntimeDecoderSyntaxH1a6vFuVKchHkTf7r997883197317993 heliosRuntimeDecoderSyntaxH1a6vFuVKchHkTf7r997883197317993) {
        super(str);
        this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = heliosRuntimeDecoderSyntaxH1a6vFuVKchHkTf7r997883197317993;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MysticCacheRepositoryAlgorithmV2mDu3lUYccL9Fkuay52366843147769)) {
            return false;
        }
        MysticCacheRepositoryAlgorithmV2mDu3lUYccL9Fkuay52366843147769 mysticCacheRepositoryAlgorithmV2mDu3lUYccL9Fkuay52366843147769 = (MysticCacheRepositoryAlgorithmV2mDu3lUYccL9Fkuay52366843147769) obj;
        return YellowLoopStoragePayloadVFtu5CxYzqP8AEqxI345075376816214.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333(mysticCacheRepositoryAlgorithmV2mDu3lUYccL9Fkuay52366843147769.getMessage(), getMessage()) && YellowLoopStoragePayloadVFtu5CxYzqP8AEqxI345075376816214.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333(mysticCacheRepositoryAlgorithmV2mDu3lUYccL9Fkuay52366843147769.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867, this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867) && YellowLoopStoragePayloadVFtu5CxYzqP8AEqxI345075376816214.TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333(mysticCacheRepositoryAlgorithmV2mDu3lUYccL9Fkuay52366843147769.getCause(), getCause());
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        String message = getMessage();
        message.getClass();
        int hashCode = (this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867.hashCode() + (message.hashCode() * 31)) * 31;
        Throwable cause = getCause();
        return hashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return super.toString() + "; job=" + this.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
    }
}

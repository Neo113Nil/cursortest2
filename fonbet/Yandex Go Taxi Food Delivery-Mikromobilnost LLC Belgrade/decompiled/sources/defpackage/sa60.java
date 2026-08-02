package defpackage;

import com.squareup.moshi.Types;
import com.ybsdk.rconfig.CommonExperiment;
import com.ybsdk.rconfig.ExperimentApplyType;
import com.ybsdk.rconfig.configs.NfcWatchSettingsConfig;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes9.dex */
public abstract class sa60 {
    public static final dfr a = new dfr("yb_mobile_nfc_watch_settings_config", Types.newParameterizedType(CommonExperiment.class, NfcWatchSettingsConfig.class), new CommonExperiment(new NfcWatchSettingsConfig(false, null, null, null, null, null, null, EmptyList.a, HProv.PP_DELETE_SAVED_PASSWD, null), ExperimentApplyType.LATEST));
}

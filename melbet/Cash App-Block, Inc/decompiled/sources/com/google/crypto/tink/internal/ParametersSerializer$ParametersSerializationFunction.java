package com.google.crypto.tink.internal;

import androidx.work.impl.WorkLauncherImpl;
import com.google.crypto.tink.Parameters;

/* loaded from: classes.dex */
public interface ParametersSerializer$ParametersSerializationFunction {
    WorkLauncherImpl serializeParameters(Parameters parameters);
}

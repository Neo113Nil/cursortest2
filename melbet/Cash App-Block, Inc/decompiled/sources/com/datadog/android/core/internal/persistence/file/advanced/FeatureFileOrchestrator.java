package com.datadog.android.core.internal.persistence.file.advanced;

import kotlin.text.Regex;

/* loaded from: classes4.dex */
public final class FeatureFileOrchestrator extends ConsentAwareFileOrchestrator {
    public static final Regex IS_GRANTED_DIR_REG_EX = new Regex("([a-z]+-)+v[0-9]+");
    public static final Regex IS_PENDING_DIR_REG_EX = new Regex("([a-z]+-)+pending-v[0-9]+");
}

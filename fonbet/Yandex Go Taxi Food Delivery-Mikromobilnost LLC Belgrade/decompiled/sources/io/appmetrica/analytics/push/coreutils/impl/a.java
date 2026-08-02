package io.appmetrica.analytics.push.coreutils.impl;

import io.appmetrica.analytics.push.coreutils.internal.commands.Commands;
import java.util.HashMap;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

/* loaded from: classes4.dex */
public final class a extends HashMap {
    public a(b bVar, int i) {
        put(ACSPConstants.STATUS, Integer.valueOf(i));
        put("command", bVar.b.getString(Commands.EXTRA_COMMAND));
    }
}

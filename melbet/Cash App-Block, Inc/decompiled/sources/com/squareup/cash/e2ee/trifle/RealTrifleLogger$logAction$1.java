package com.squareup.cash.e2ee.trifle;

import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.squareup.cash.keystore.AttestedKeyService;
import com.squareup.cash.keystore.RealAttestedKeyService;
import com.squareup.cash.observability.backend.api.Action;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.MapsKt__MapsKt;

/* loaded from: classes6.dex */
public final class RealTrifleLogger$logAction$1 implements Action {
    public final /* synthetic */ int $r8$classId;
    public final Map attributes;
    public final String name;

    /* renamed from: type, reason: collision with root package name */
    public final Action.Type f1126type;

    public RealTrifleLogger$logAction$1(TrifleAction trifleAction) {
        this.$r8$classId = 0;
        this.name = "CashTrifleAction: ".concat(trifleAction.description);
        this.f1126type = Action.Type.CUSTOM;
        String name = trifleAction.name();
        if (name.length() > 0) {
            StringBuilder sb = new StringBuilder();
            String valueOf = String.valueOf(name.charAt(0));
            valueOf.getClass();
            String lowerCase = valueOf.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            sb.append((Object) lowerCase);
            sb.append(name.substring(1));
            name = sb.toString();
        }
        this.attributes = Thread$State$EnumUnboxingLocalUtility.m("trifle_action_type", name);
    }

    @Override // com.squareup.cash.observability.backend.api.Action
    public final Map getAttributes() {
        switch (this.$r8$classId) {
        }
        return this.attributes;
    }

    @Override // com.squareup.cash.observability.backend.api.Action
    public final String getName() {
        switch (this.$r8$classId) {
        }
        return this.name;
    }

    @Override // com.squareup.cash.observability.backend.api.Action
    public final Action.Type getType() {
        switch (this.$r8$classId) {
        }
        return this.f1126type;
    }

    public RealTrifleLogger$logAction$1(RealAttestedKeyService realAttestedKeyService, String str) {
        this.$r8$classId = 1;
        str.getClass();
        this.name = str;
        this.f1126type = Action.Type.CUSTOM;
        Pair pair = new Pair("keyAlias", realAttestedKeyService.keyAlias);
        AttestedKeyService.GenerationMode generationMode = AttestedKeyService.GenerationMode.RECREATE_AT_STARTUP;
        this.attributes = MapsKt__MapsKt.mapOf(pair, new Pair("generationMode", "RECREATE_AT_STARTUP"));
    }
}

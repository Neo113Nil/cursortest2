package com.squareup.cash.db2.profile.documents;

import app.cash.local.db.Local_tab_content;
import app.cash.sqldelight.EnumColumnAdapter;
import com.squareup.cash.db.EnumListAdapter;
import com.squareup.cash.db.WireAdapter;
import com.squareup.cash.db2.profile.ScenarioPlan;
import com.squareup.protos.cash.registrar.api.StatementCoverage;
import com.squareup.protos.cash.registrar.api.StatementType;
import com.squareup.protos.document.DocumentCategoryEntity;
import com.squareup.protos.document.VersionData;
import com.squareup.wire.ProtoAdapter;

/* loaded from: classes.dex */
public abstract class AdaptersKt {
    public static final Local_tab_content.Adapter availableAccountStatementAdapter;
    public static final EnumListAdapter customerStatementsAdapter;
    public static final Local_tab_content.Adapter documentAdapter;
    public static final ScenarioPlan.Adapter documentCategoryAdapter;

    static {
        ProtoAdapter protoAdapter = VersionData.ADAPTER;
        documentAdapter = new Local_tab_content.Adapter(new WireAdapter(protoAdapter));
        documentCategoryAdapter = new ScenarioPlan.Adapter(new EnumColumnAdapter(DocumentCategoryEntity.RenderStyle.values()), new WireAdapter(protoAdapter));
        availableAccountStatementAdapter = new Local_tab_content.Adapter(new WireAdapter(StatementCoverage.ADAPTER));
        customerStatementsAdapter = new EnumListAdapter(new EnumColumnAdapter(StatementType.values()));
    }
}

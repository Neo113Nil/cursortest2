package defpackage;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\n"}, d2 = {"Lrfy0;", "", "<init>", "()V", "", "b", "Ljava/lang/String;", "CREATE_TEMPLATES_TABLE_QUERY", "c", "CREATE_TEMPLATE_USAGES_TABLE_QUERY", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class rfy0 {
    public static final rfy0 a = new rfy0();

    /* renamed from: b, reason: from kotlin metadata */
    public static final String CREATE_TEMPLATES_TABLE_QUERY = "CREATE TABLE IF NOT EXISTS `templates` (`template_id` TEXT NOT NULL, `template_data` BLOB NOT NULL, PRIMARY KEY(`template_id`))";

    /* renamed from: c, reason: from kotlin metadata */
    public static final String CREATE_TEMPLATE_USAGES_TABLE_QUERY = "CREATE TABLE IF NOT EXISTS `template_usages` (`card_id` TEXT NOT NULL, `template_id` TEXT NOT NULL, PRIMARY KEY(`card_id`, `template_id`))";

    private rfy0() {
    }
}

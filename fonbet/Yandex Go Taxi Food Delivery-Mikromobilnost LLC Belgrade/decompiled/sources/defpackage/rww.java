package defpackage;

import com.apollographql.apollo3.api.c;

/* loaded from: classes2.dex */
public final class rww implements ejg0 {
    public final String a;

    public rww(String str) {
        this.a = str;
    }

    @Override // defpackage.fc70
    public final void a(bfx bfxVar, c cVar) {
        bfxVar.A1("language");
        foe foeVar = l80.a;
        uga1.f(bfxVar, this.a);
    }

    @Override // defpackage.fc70
    public final ep60 adapter() {
        return l80.a(sww.a);
    }

    @Override // defpackage.fc70
    public final String b() {
        return "query InviteToFamilyWebUrl($language: LanguageISO639Scalar!) { familyInvite(input: { language: $language } ) { webViewInvite { webViewUrl skipText } inviteCancellationReason } }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rww) && this.a.equals(((rww) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.fc70
    public final String id() {
        return "7b62af27c2d26d2112a96cbb9272dfc737c00e72ffeb09694270d8824903739b";
    }

    @Override // defpackage.fc70
    public final String name() {
        return "InviteToFamilyWebUrl";
    }

    public final String toString() {
        return "InviteToFamilyWebUrlQuery(language=" + ((Object) this.a) + ')';
    }
}

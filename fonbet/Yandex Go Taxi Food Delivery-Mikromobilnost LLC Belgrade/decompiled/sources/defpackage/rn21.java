package defpackage;

import ru.yandex.taxi.settings.profile.UserInfoProfileView;

/* loaded from: classes6.dex */
public final /* synthetic */ class rn21 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ UserInfoProfileView b;

    public /* synthetic */ rn21(UserInfoProfileView userInfoProfileView, int i) {
        this.a = i;
        this.b = userInfoProfileView;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int avatarSize_delegate$lambda$0;
        zy11 image$lambda$0;
        int i = this.a;
        UserInfoProfileView userInfoProfileView = this.b;
        switch (i) {
            case 0:
                avatarSize_delegate$lambda$0 = UserInfoProfileView.avatarSize_delegate$lambda$0(userInfoProfileView);
                break;
            case 1:
                avatarSize_delegate$lambda$0 = UserInfoProfileView.mSpace_delegate$lambda$0(userInfoProfileView);
                break;
            default:
                image$lambda$0 = UserInfoProfileView.setImage$lambda$0(userInfoProfileView);
                return image$lambda$0;
        }
        return Integer.valueOf(avatarSize_delegate$lambda$0);
    }
}

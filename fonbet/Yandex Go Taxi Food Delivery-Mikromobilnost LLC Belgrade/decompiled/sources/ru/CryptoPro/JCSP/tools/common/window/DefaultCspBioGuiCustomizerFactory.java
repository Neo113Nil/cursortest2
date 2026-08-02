package ru.CryptoPro.JCSP.tools.common.window;

import ru.CryptoPro.JCSP.api.bio.CspBioGuiCustomizer;
import ru.CryptoPro.JCSP.api.bio.CspBioGuiCustomizerFactory;

/* loaded from: classes4.dex */
public class DefaultCspBioGuiCustomizerFactory implements CspBioGuiCustomizerFactory {
    @Override // ru.CryptoPro.JCSP.api.bio.CspBioGuiCustomizerFactory
    public CspBioGuiCustomizer createInstance() {
        return new DefaultCspBioGuiCustomizer();
    }
}

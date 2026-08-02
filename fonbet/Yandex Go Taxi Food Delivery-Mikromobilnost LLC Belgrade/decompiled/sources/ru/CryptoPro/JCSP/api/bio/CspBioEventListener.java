package ru.CryptoPro.JCSP.api.bio;

import ru.CryptoPro.JCSP.api.bio.event.CspBioChangeMaxEvent;
import ru.CryptoPro.JCSP.api.bio.event.CspBioChangeProgressEvent;

/* loaded from: classes4.dex */
public interface CspBioEventListener {
    void onMaxChanged(CspBioChangeMaxEvent cspBioChangeMaxEvent);

    void onProgressChanged(CspBioChangeProgressEvent cspBioChangeProgressEvent);
}
